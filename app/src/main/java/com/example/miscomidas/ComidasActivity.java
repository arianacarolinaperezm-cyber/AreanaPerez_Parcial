package com.example.miscomidas;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ComidasActivity extends AppCompatActivity {

    BottomNavigationView menuComidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getIntent().getStringExtra("usuario") == null) {
            startActivity(new Intent(this, IngresoComidasActivity.class));
            finish();
            return;
        }

        setContentView(R.layout.activity_comidas);

        menuComidas = findViewById(R.id.menuComidas);
        menuComidas.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment pantalla = null;

                if (item.getItemId() == R.id.opcionInicio) {
                    pantalla = new InicioComidasFragment();
                } else if (item.getItemId() == R.id.opcionConfiguracion) {
                    pantalla = new ConfiguracionComidasFragment();
                }

                if (pantalla != null) {
                    mostrarPantalla(pantalla);
                    return true;
                }
                return false;
            }
        });

        if (savedInstanceState == null) {
            mostrarPantalla(new InicioComidasFragment());
        }
    }

    private void mostrarPantalla(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedorComidas, fragment)
                .commit();
    }
}

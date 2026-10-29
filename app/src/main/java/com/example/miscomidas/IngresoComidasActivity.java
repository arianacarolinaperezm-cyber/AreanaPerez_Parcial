package com.example.miscomidas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class IngresoComidasActivity extends AppCompatActivity {

    EditText txtUsuario, txtContrasena;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_comidas);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(v -> {
            String usuario = txtUsuario.getText().toString().trim();
            String contrasena = txtContrasena.getText().toString();

            if (usuario.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(this, "Completa los dos campos", Toast.LENGTH_SHORT).show();
            } else if (usuario.equalsIgnoreCase(getString(R.string.usuario_permitido)) && contrasena.equals("12345678")) {
                Intent intent = new Intent(this, ComidasActivity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

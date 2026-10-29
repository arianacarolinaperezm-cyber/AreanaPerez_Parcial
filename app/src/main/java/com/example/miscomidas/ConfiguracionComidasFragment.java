package com.example.miscomidas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ConfiguracionComidasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuracion_comidas, container, false);

        TextView txtNombreUsuario = view.findViewById(R.id.txtNombreUsuario);
        Button btnCerrarSesion = view.findViewById(R.id.btnCerrarSesion);

        String usuario = requireActivity().getIntent().getStringExtra("usuario");
        txtNombreUsuario.setText(usuario);

        btnCerrarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IngresoComidasActivity.class);
            startActivity(intent);
            requireActivity().finish();
        });

        return view;
    }
}

package com.example.miscomidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.squareup.picasso.Picasso;
import de.hdodenhof.circleimageview.CircleImageView;

public class InicioComidasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio_comidas, container, false);

        CircleImageView imgPizza = view.findViewById(R.id.imgPizza);
        CircleImageView imgHamburguesa = view.findViewById(R.id.imgHamburguesa);
        CircleImageView imgPasta = view.findViewById(R.id.imgPasta);
        CircleImageView imgPostre = view.findViewById(R.id.imgPostre);

        Picasso.with(requireContext()).load(R.drawable.pizza).into(imgPizza);
        Picasso.with(requireContext()).load(R.drawable.hamburguesa).into(imgHamburguesa);
        Picasso.with(requireContext()).load(R.drawable.pasta).into(imgPasta);
        Picasso.with(requireContext()).load(R.drawable.postre).into(imgPostre);

        return view;
    }
}

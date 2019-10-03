package com.example.myapplication.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.Relative_Profile;

import static com.example.myapplication.R.layout.fragment_frag__profile;

public class Frag_Profile extends Fragment {
    Button b1;
    Button b2;



        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View myView = inflater.inflate(fragment_frag__profile, container, false);
            b1 = (Button) myView.findViewById(R.id.relative);
            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent goToRelative = new Intent(getActivity(), Relative_Profile.class);
                    getActivity().startActivity(goToRelative);

                }
            });
            b2 = (Button) myView.findViewById(R.id.logout2);
            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent goToMain = new Intent(getActivity(), MainActivity.class);
                    getActivity().startActivity(goToMain);

                }
            });
            return myView;
        }


}

package co.verdedigital.empollados;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import co.verdedigital.model.Polla;

/**
 * Created by ameza on 23/08/13.
 */
public class PollaTab1Fragment extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.polla_tab1_fragment, container, false);

        EditText nombrePolla = (EditText) v.findViewById(R.id.nombrePolla);
        EditText nombreTorneo = (EditText) v.findViewById(R.id.nombreTorneo);


        Intent intent = getActivity().getIntent();
        Polla instance = (Polla) intent.getSerializableExtra(MainActivity.EXTRA_POLLA);
        nombrePolla.setText(instance.titulo);
        nombreTorneo.setText(instance.getFase(1).getTorneo().titulo);

        return v;
    }
}

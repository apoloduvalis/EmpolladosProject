package co.verdedigital.empollados;

import java.math.BigDecimal;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import co.verdedigital.adapters.PollasArrayAdapter;
import co.verdedigital.model.Polla;
import co.verdedigital.services.Setup;

public class MainActivity extends Activity
{
    public final static String EXTRA_POLLA = "co.verdedigital.empollados.POLLA";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.main_mis_pollas_list);
        List<Polla> pollas = Setup.loadConfiguration("ameza");
        Polla[] values = pollas.toArray(new Polla[pollas.size()]);

        PollasArrayAdapter adapter = new PollasArrayAdapter(this,values);

        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void abrirPollaExistente(View view)
    {
        Intent intent = new Intent(this, PollaActivity.class);
        PollasArrayAdapter.PollaViewHolder holder = (PollasArrayAdapter.PollaViewHolder) ((RelativeLayout) view.getParent()).getTag();
        Polla instance = holder.instanciaPolla;
        intent.putExtra(EXTRA_POLLA, instance);
        startActivity(intent);
    }
}

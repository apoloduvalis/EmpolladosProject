package co.verdedigital.empollados;

import java.math.BigDecimal;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

import co.verdedigital.adapters.PollasArrayAdapter;
import co.verdedigital.model.Polla;
import co.verdedigital.services.Setup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.main_mis_pollas_list);
        List<Polla> pollas = Setup.loadConfiguration("ameza");
        Polla[] values = new Polla[2];
        values[0] = pollas.get(0);
        values[1] = pollas.get(1);
        /*
        values[1] = new Polla(BigDecimal.valueOf(10.0),"Champions League",true,null);
        values[2] = new Polla(BigDecimal.valueOf(20.0),"Eliminatorias Mundial",true,null);
*/

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - the Array of data

        PollasArrayAdapter adapter = new PollasArrayAdapter(this,values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}

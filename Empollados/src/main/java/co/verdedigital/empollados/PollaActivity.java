package co.verdedigital.empollados;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.EditText;

import co.verdedigital.model.Polla;
import co.verdedigital.adapters.TabListener;
import co.verdedigital.empollados.PollaTab1Fragment;

import static android.app.ActionBar.*;

public class PollaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show the Up button in the action bar.
        setupActionBar(savedInstanceState);



    }

    /**
     * Set up the {@link android.app.ActionBar}.
     */
    private void setupActionBar(Bundle savedInstanceState)
    {
        final ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(NAVIGATION_MODE_TABS);
        actionBar.setDisplayOptions(0, DISPLAY_SHOW_TITLE);

        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("Polla");
        tab1.setTabListener(new TabListener<PollaTab1Fragment>(this,"tab1",PollaTab1Fragment.class));
        actionBar.addTab(tab1);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Partidos");
        tab2.setTabListener(new TabListener<PollaTab2Fragment>(this,"tab2",PollaTab2Fragment.class));
        actionBar.addTab(tab2);

        ActionBar.Tab tab3 = actionBar.newTab();
        tab3.setText("Miembros");
        tab3.setTabListener(new TabListener<PollaTab3Fragment>(this,"tab3",PollaTab3Fragment.class));
        actionBar.addTab(tab3);

        if (savedInstanceState != null)
        {
            actionBar.setSelectedNavigationItem(savedInstanceState.getInt("tab", 0));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("tab", getActionBar().getSelectedNavigationIndex());



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.polla, menu);
        return true;
    }
    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

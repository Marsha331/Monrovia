package net.swallowsnest.monrovia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by marshas on 10/8/16.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        final ArrayList<Sight> sights = new ArrayList <Sight>();
        sights.add(new Sight(getString(R.string.tommy), getString(R.string.tommy_loc)));
        sights.add(new Sight(getString(R.string.rudy), getString(R.string.rudy_loc)));
        sights.add(new Sight(getString(R.string.pizza), getString(R.string.pizza_loc)));
        sights.add(new Sight(getString(R.string.mooyah), getString(R.string.mooyah_loc)));
        sights.add(new Sight(getString(R.string.jake), getString(R.string.jake_loc)));
        sights.add(new Sight(getString(R.string.jb), getString(R.string.jb_loc)));
        sights.add(new Sight(getString(R.string.sow), getString(R.string.sow_loc)));

        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(this, sights, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sight_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SightAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sight} in the list.
        listView.setAdapter(adapter);
    }
}

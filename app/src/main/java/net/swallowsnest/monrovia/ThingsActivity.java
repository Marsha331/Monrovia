package net.swallowsnest.monrovia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by marshas on 10/8/16.
 */

public class ThingsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        final ArrayList<Sight> sights = new ArrayList <Sight>();
        sights.add(new Sight(getString(R.string.falls), getString(R.string.falls_loc), R.drawable.waterfall));
        sights.add(new Sight(getString(R.string.house), getString(R.string.house_loc), R.drawable.sinclair_house));
        sights.add(new Sight(getString(R.string.museum), getString(R.string.museum_loc), R.drawable.history_museum));
        sights.add(new Sight(getString(R.string.park), getString(R.string.park_loc), R.drawable.library_park));
        sights.add(new Sight(getString(R.string.krikorian), getString(R.string.krikorian_loc), R.drawable.krikorian));

        // Create an {@link SightAdapter}, whose data source is a list of {@link Sight}s. The
        // adapter knows how to create list items for each item in the list.
        SightAdapter adapter = new SightAdapter(this, sights, R.color.colorPrimary);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

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
        sights.add(new Sight("Tommy's Burgers", "849 E Huntington Blvd"));
        sights.add(new Sight("Rudy's Mexican", "602 S Myrtle Ave"));
        sights.add(new Sight("Old Town Pizza", "338 S Myrtle Ave"));
        sights.add(new Sight("Mooyah Burgers", "116 W Foothill Blvd"));
        sights.add(new Sight("Jake's Roadhouse", "622 S Myrtle Ave"));
        sights.add(new Sight("JB's Burgers", "627 S Myrtle Ave"));
        sights.add(new Sight("Sow House", "404 S Myrtle Ave"));

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

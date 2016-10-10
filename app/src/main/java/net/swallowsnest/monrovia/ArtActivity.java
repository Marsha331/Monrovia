package net.swallowsnest.monrovia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by marshas on 10/8/16.
 */

public class ArtActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sight_list);

        final ArrayList<Sight> sights = new ArrayList <Sight>();
        sights.add(new Sight("@string/marktwain", "@string/library", R.drawable.mark_twain));
        sights.add(new Sight("@string/bear", "@string/myrtle", R.drawable.bear));
        sights.add(new Sight("@string/action", "@string/theater", R.drawable.action));
        sights.add(new Sight("@string/fountain", "@string/library", R.drawable.fountain));
        sights.add(new Sight("@string/book", "@string/ibrary", R.drawable.book_mural));

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

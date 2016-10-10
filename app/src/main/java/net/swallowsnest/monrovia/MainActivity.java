package net.swallowsnest.monrovia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the category
        TextView restaurants = (TextView)findViewById(R.id.restaurants);

        //Set the onClick listener for that view
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                startActivity(restaurantsIntent);
            }
        });

        //Find the view that shows the numbers category
        TextView art = (TextView)findViewById(R.id.art);

        //Set the onClick listener for that view
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainActivity.this, ArtActivity.class);

                startActivity(artIntent);
            }
        });

        //Find the view that shows the category
        TextView filming = (TextView)findViewById(R.id.filming);

        //Set the onClick listener for that view
        filming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filmingIntent = new Intent(MainActivity.this, FilmingActivity.class);

                startActivity(filmingIntent);
            }
        });

        //Find the view that shows the category
        TextView things = (TextView)findViewById(R.id.things_to_do);

        //Set the onClick listener for that view
        things.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingsIntent = new Intent(MainActivity.this, ThingsActivity.class);

                startActivity(thingsIntent);
            }
        });
    }
}

package com.example.abilinski88.cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] attraction={"Art Institute of Chicago", "Magnificent Mile",
                "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main, R.id.travel, attraction));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu ")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse
                        ("http://themagnificentmile.com")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Willis.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
        }
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

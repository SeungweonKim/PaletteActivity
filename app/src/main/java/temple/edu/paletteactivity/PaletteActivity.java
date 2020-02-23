package temple.edu.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.os.Bundle;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("PaletteActivity");
        Spinner spinner = findViewById(R.id.spinner);

        // Add custom items
        TypedArray ta = getResources().obtainTypedArray(R.array.colors);
        final int[] colors = new int[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            colors[i] = ta.getColor(i, 0);
        }
        CustomAdapter customAdapter = new CustomAdapter(this, colors);
        spinner.setAdapter(customAdapter);
        // Set on click

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(getApplicationContext(), CanvasActivity.class);
                myIntent.putExtra("color",colors[position] );
                startActivity(myIntent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
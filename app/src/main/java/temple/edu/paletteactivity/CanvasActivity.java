package temple.edu.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        setTitle("CanvasActivity");

        int selectedColor= getIntent().getExtras().getInt("color");
        RelativeLayout layout = findViewById(R.id.canvas_act);
        layout.setBackgroundColor(selectedColor);
    }
}

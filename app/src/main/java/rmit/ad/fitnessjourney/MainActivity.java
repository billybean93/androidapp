package rmit.ad.fitnessjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        
        Button btn_about = (Button) findViewById(R.id.about_us);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    private void openDialog() {
        AboutUsDialog aboutUsDialog = new AboutUsDialog();
        aboutUsDialog.show(getSupportFragmentManager(), "example dialog");
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
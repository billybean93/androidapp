package rmit.ad.fitnessjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn_strength = (Button) findViewById(R.id.btn_strength);
        Button btn_cardio = (Button) findViewById(R.id.btn_cardio);
        btn_strength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        btn_cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity5();}
        });
    }

    public void openActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}
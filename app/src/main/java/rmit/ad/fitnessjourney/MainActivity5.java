package rmit.ad.fitnessjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    private ExerciseAdapter exerciseAdapter;
    private SearchView searchView;

    List<Exercise> exercises = new ArrayList<Exercise>();


    public MainActivity5() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);






        exercises.add(new Exercise(R.drawable.froggy_jumps, "cardio", "relaxed",
                "Place your feet about hip-width apart, and squat low enough that you can put your hands on the floor in front of you.\n" +
                        "Explode and jump up, using your glutes, quads, and hamstrings to generate power.\n" +
                        "Tap your heels together as you jump and take the hands behind your head or up in the air.\n" +
                        "Land with bent knees to protect the joints and go back into your squat to prepare for the next jump.\n" +
                        "Repeat 10 to 20 froggy jumps. Rest and repeat if desired."));
        exercises.add(new Exercise(R.drawable.burpees, "cardio", "mild",
                "Stand with feet about hip-width apart and squat to the floor, placing your hands on the floor in front of you.\n" +
                        "Jump explosively with your feet out behind you so that you're in a push-up position, on your hands and toes with your body in a straight line.\n" +
                        "Do a push-up on your toes or knees (this is optional and adds quite a bit of intensity).\n" +
                        "Jump the feet back to start immediately, stand up, and repeat for 10 to 15 reps or 30 to 60 seconds."));
        exercises.add(new Exercise(R.drawable.mountain_climbers, "cardio", "intense",
                "Begin in a push-up position on your hands and toes, back flat, and abs engaged.\n" +
                        "Bring your right knee in towards the chest, resting the foot on the floor.\n" +
                        "Jump up and switch feet in the air, bringing the left foot in and the right foot back.\n" +
                        "Continue alternating the feet as fast as you safely can for 30 to 60 seconds."));
        exercises.add(new Exercise(R.drawable.squat_jumps, "cardio", "relaxed",
                "Begin with feet about hip-distance apart and engage the core.\n" +
                        "Squat as low as possible, touching the floor with your fingertips if you can. Make sure you send the hips back to avoid putting too much pressure on the knees.\n" +
                        "Jump up as high as you can, sweeping your arms overhead.\n" +
                        "Land with soft knees back into your squat and repeat for 30 to 60 seconds."));
        exercises.add(new Exercise(R.drawable.jumping_jacks, "cardio", "mild",
                "Stand facing a step or platform and jump up onto it with both feet.\n" +
                        "Jump back down to the floor, or step down to the floor if jumping feels unsafe or uncomfortable.\n" +
                        "Perform a jumping jack on the floor and, after you jump the feet back together, jump back onto the step.\n" +
                        "Continue alternating a jump on the step and a jumping jack for 30 to 60 seconds."));
        exercises.add(new Exercise(R.drawable.toe_taps, "cardio", "intense",
                "Stand facing a step or platform.\n" +
                        "Touch the right toe to the step, jump up and switch the feet in mid-air, touching the left toe to the step.\n" +
                        "Continue alternating toe taps as quickly and safely as you can for 30 to 60 seconds."));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ExerciseAdapter(getApplicationContext(),exercises));
        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(this, exercises);
    }

    //Attempting to create a search but no failed.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
//                exerciseAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                exerciseAdapter.getFilter().filter(newText);
//
                return true;

            }
        });
        return super.onCreateOptionsMenu(menu);

    }


        }


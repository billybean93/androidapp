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

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    SearchView searchView;
//    ExerciseAdapter exerciseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Exercise> exercises = new ArrayList<Exercise>();


        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(this, exercises);
        exercises.add(new Exercise(R.drawable.barbell_bench_press, "strength","chest",
                "1. " +
                        "Lay flat on the bench with your feet on the ground. With straight arms unrack the bar.\n\n" +
                        "2. " +
                        "Lower the bar to your mid chest\n\n" +
                        "3. " +
                        "Raise the bar until you've locked your elbows."));
        exercises.add(new Exercise(R.drawable.push_up,"strength","chest",
                "1. " +
                        "Place your hands firmly on the ground, directly under shoulders.\n\n" +
                        "2. " +
                        "Flatten your back so your entire body is straight and slowly lower your body\n\n" +
                        "3. " +
                        "Draw shoulder blades back and down, keeping elbows tucked close to your body\n\n" +
                        "4. " +
                        "Exhale as you push back to the starting position."));
        exercises.add(new Exercise(R.drawable.dumbbell_chest_flys, "strength", "chest",
                "1. " +
                        "Lay flat on the bench and place your feet on the ground.\n\n" +
                        "2. " +
                        "Begin the exercise with the dumbbells held together above your chest, elbows slightly bent.\n\n" +
                        "3. " +
                        "Simultaneously lower the weights to either side.\n\n" +
                        "4. " +
                        "Pause when the weights are parallel to the bench, then raise your arms to the starting position."));
        exercises.add(new Exercise(R.drawable.barbell_overhead_press, "strength", "shoulder",
                "1. " +
                        "Take a roughly shoulder width grip. There should be a straight line from your elbow to fist (vertical forearms).\n\n" +
                        "2. " +
                        "Pull your chin back and press the weight toward the ceiling by extending at the elbow joint and flexing at the shoulder joint.\n\n" +
                        "3. " +
                        "Press until your elbows are extended and push your head forward slightly.\n\n" +
                        "4. " +
                        "Return to the start position with control. Pulling your chin back to allow the bar to pass your face safely."));
        exercises.add(new Exercise(R.drawable.cable_low, "strength", "shoulder",
                "1. " +
                        "Use a handle attachment with the cable set all the way to the bottom of the machine.\n\n" +
                        "2. " +
                        "You should vertically abduct at the shoulder raising your arm straight out to the side.\n\n" +
                        "3. " +
                        "Raise until your arm is parallel with the ground and then back to the starting position." ));
        exercises.add(new Exercise(R.drawable.hand_plank, "strength", "abs",
                "1. " +

                        "Start in a kneeling position with your hands planted on the ground.\n" +
                          "2. " +
                          "Pick your knees up off the ground. Hold in this position with a flat back."  ));
        exercises.add(new Exercise(R.drawable.barbell_situp, "strength", "abs",
                "1. " +
                        "Hold the bar with a slightly wider than shoulder width grip. Push the bar up toward the ceiling and maintain that elbow extension.\n" +
                        "2. " +
                        "Flex your abs and sit-up. Aim to get your torso vertical while maintaining the barbell overhead."));
        exercises.add(new Exercise(R.drawable.dumbell_russian_twist, "strength", "abs",
                "1. " +
                        "Sit on the floor and flex your knees and hips to a 90 degree angle.\n" +
                        "2. " +
                        "Your feet should be hovering off the ground. (If that's too hard start with heels on the floor)\n" +
                        "3. " +
                        "Rotate your upper spine to engage your obliques."));
        exercises.add(new Exercise(R.drawable.barbell_roll_outs, "strength", "abs",
                        "1. " +
                                "Hold the Barbell with both hands and kneel on the floor with your feet up\n" +
                                "2. " +
                                "Slowly roll the Barbell straight forward, stretching your body into a straight position.\n" +
                                "3. " +
                                "After a pause at the stretched position, start pulling yourself back to the starting position. This should be a slow and controlled movement."));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ExerciseAdapter(this, exercises));

    }
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


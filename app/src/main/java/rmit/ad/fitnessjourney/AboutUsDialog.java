package rmit.ad.fitnessjourney;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AboutUsDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About us")
                .setMessage("Your ally for a healthier life!\n" +
                        "\n" +
                        "\uD83D\uDE80 Mission: Inspire, motivate, guide to fitness goals.\n" +
                        "\n" +
                        "\uD83D\uDC65 Team: Certified trainers, nutritionists, fitness enthusiasts.\n" +
                        "\n" +
                        "\uD83D\uDD04 Approach: Holistic fitness — activity, nutrition, well-being.\n" +
                        "\n" +
                        "\uD83E\uDD1D Community: Dynamic, motivated, group workouts, events.\n" +
                        "\n" +
                        "FitJour - Elevate your fitness journey!\n" +
                        "\n")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}

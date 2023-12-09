package rmit.ad.fitnessjourney;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHoder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView description, type, muscle_group;
    public MyViewHoder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.exeDemo);
        description = itemView.findViewById(R.id.exeDescrip);
        type = itemView.findViewById(R.id.exeType);
        muscle_group = itemView.findViewById(R.id.musGroup);
    }
}

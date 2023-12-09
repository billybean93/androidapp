package rmit.ad.fitnessjourney;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExerciseAdapter extends RecyclerView.Adapter<MyViewHoder> implements Filterable{

    Context context;
    List<Exercise> items;
    List<Exercise> items2;

    public ExerciseAdapter(Context context, List<Exercise> items) {
        this.context = context;
        this.items = items;
        }



    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHoder(LayoutInflater.from(context).inflate(R.layout.indi_ex,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        holder.description.setText(items.get(position).getDescription());
        holder.type.setText(items.get(position).getType());
        holder.muscle_group.setText(items.get(position).getMuscle_group());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String strsearch = constraint.toString();
                if (strsearch.isEmpty()){
                    items = items2;
                }
                else {
                    List<Exercise> list = new ArrayList<>();
                    for (Exercise exercise : items2){
                        if (exercise.getType().contains(strsearch)){
                            list.add(exercise);
                        }
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = items;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                items = (List<Exercise>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}

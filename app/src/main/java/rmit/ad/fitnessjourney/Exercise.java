package rmit.ad.fitnessjourney;

public class Exercise {

    int image;
    private String type;
    private String muscle_group;
    private String description;

    public Exercise(int image, String type, String muscleGroup, String description) {
        this.image = image;
        this.type = type;
        muscle_group = muscleGroup;
        this.description = description;

    }




    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMuscle_group() {
        return muscle_group;
    }

    public void setMuscle_group(String muscle_group) {
        this.muscle_group = muscle_group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

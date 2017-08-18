/**
 * Created by jc325134 on 18/08/17.
 */
public class FitnessTracker {

    private String fitnessactivity;
    private int minutes;
    private String date;

    public FitnessTracker(){
        this("running",0,"January 1");
    }

    public FitnessTracker(String fitnessactivity, int minutes, String date){
        this.fitnessactivity = fitnessactivity;
        this.minutes = minutes;
        this.date = date;

    }

    public String getFitnessactivity() {
        return fitnessactivity;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getDate() {
        return date;
    }


}


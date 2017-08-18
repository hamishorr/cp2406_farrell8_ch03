/**
 * Created by jc325134 on 18/08/17.
 */
public class TestFitnessTracker{

    public static void main(String Args[]){
        FitnessTracker tracker = new FitnessTracker("riding", 1, "jan 5");
        System.out.println(tracker.getFitnessactivity() +
                tracker.getMinutes() + "minutes on" + tracker.getDate());

    }
}
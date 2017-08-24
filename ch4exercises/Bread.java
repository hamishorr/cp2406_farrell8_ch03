public class Bread {

    private String type;
    private double calories;

    Bread(String type, double calories){
        this.type = type;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public final static String MOTTO(){
        return "The Staff of Life";
    }
}

/**
 * Created by jc325134 on 18/08/17.
 */
public class BloodData {

    private String bloodType;
    private String bloodRh;

    public BloodData(){
        this("O","+");
    }
    public BloodData(String bloodType, String BloodRh){
        this.bloodType = bloodType;
        this.bloodRh = BloodRh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodRh() {
        return bloodRh;
    }

    public void setBloodRh(String bloodRh) {
        this.bloodRh = bloodRh;
    }
}

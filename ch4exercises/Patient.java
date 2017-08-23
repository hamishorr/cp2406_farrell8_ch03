/**
 * Created by jc325134 on 18/08/17.
 */
public class Patient{

    private BloodData blood;
    private int ID;
    private int age;


    Patient(){this("O", "+", 0,0);}

    Patient(String bloodType, String bloodRh, int ID, int age){
        this.blood = new BloodData(bloodType,bloodRh);
        this.ID = ID;
        this.age = age;
    }

    public String getBlood(){
        return blood.getBloodType() + blood.getBloodRh();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

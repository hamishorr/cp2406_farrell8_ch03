// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheque = 50.00;
      double yourCheque = 19.95;;
       System.out.println("Tips are $" + calcTip(myCheque) + "and $" + calcTip(yourCheque) );
    }
    public static double calcTip(double bill)
    {
      final double RATE = 0.15;
      return bill*RATE;
    }
}

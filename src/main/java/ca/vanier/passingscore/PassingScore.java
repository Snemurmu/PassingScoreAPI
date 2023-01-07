package ca.vanier.passingscore;

public class PassingScore {
    public static void main(String args[]) // static method
    {
        boolean ret = ScoreManager.passingScore(5);
        System.out.print("The value is " + ret);
    }

}
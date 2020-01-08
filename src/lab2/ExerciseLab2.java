package lab2;

public class ExerciseLab2 {
    public static void main (String[] args){
        Scannr sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double w = sc.nextDouble();
        System.out.print ("Enter your height (Meter): ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);
        System.out.printn("Your BMI is" " " + bmi);
    }
}

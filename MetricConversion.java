import java.util.*;
public class MetricConversion {
    public static void main(String[] args){

        double miles;
        double kilometers;

        int in;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for Miles to Kilometers\nEnter 2 for Kilometers to Miles\nEnter 0 to exit");
        in = input.nextInt();

        if (in == 1) {
            System.out.print("Enter miles: ");
            miles = input.nextDouble();
            kilometers = Metric.mToKm(miles);
            System.out.println(kilometers + " kilometers");
        }
        else if (in == 2){
            System.out.print("Enter kilometers: ");
            kilometers = input.nextDouble();
            miles = Metric.kmToM(kilometers);
            System.out.println(miles + " miles");
        }
        else {
            System.exit(0);
        }

    }
}

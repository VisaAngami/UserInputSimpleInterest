import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("____________________________________________________");

        System.out.println("UserInput Simple Interest Calculator By VisaKakashi");

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Principal: ");
        float p=scn.nextFloat();

        System.out.println("Enter RateOfInterest: ");
        float i=scn.nextFloat();

        System.out.println("Enter Time: ");
        float t=scn.nextFloat();

        double SI=p*i*t/100;

        System.out.println("Simple Interest = " + SI);

        System.out.println("________________________________________________________");

    }
}

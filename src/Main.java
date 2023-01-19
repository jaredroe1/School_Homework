import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Week 2 jan-12-2023

        Scanner myObj = new Scanner(System.in);
        Scanner userWeight = new Scanner(System.in);
        Scanner userHeight = new Scanner(System.in);
        System.out.println("Please enter name");
        String userName = myObj.nextLine();


        System.out.println("Welcome: " + userName);
        System.out.println("Please enter weight");

        double weight = userWeight.nextDouble();

        System.out.println("Please enter height");
        double height = userHeight.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        System.out.println(bmi);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi <= 24.9){
            System.out.println("Normal or healthy weight");
        } else if (bmi <= 29.9){
            System.out.println("Overweight");
        } else if (bmi <= 39.9){
            System.out.println("Obese");
        } else {
            System.out.println(" Morbidly Obese");
        }


    }
}
package ConvertTemperature;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        // Công thức :celsius= (5/9)*(fahrenheit-32);
        Scanner sc= new Scanner(System.in);

        double celsius;

        double fahrenheit;
        int choice;
do {
    System.out.println("Menu");
    System.out.println("1. Fahrenheit to Celsius");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.println("0. Exit");
    System.out.println("Enter Your Choice");
    choice=sc.nextInt();
    switch (choice){
        case 1:
            System.out.println("Enter F");
            fahrenheit=sc.nextDouble();
            System.out.println("F to C :"+fahrenheitToCelsius(fahrenheit));
            break;
        case 2:
            System.out.println("Enter C");
            celsius=sc.nextDouble();
            System.out.println("C to F:"+celsiusToFahrenheit(celsius));
            break;
        case 0:
            System.exit(0);
    }


}while (choice!=0);

    }
    // C to F
    public static double celsiusToFahrenheit(double celsius){
         double fahrenheit=(9.0/5)*celsius+32;
        return fahrenheit;
    }
    // F to C
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius=(5.0/9)*(fahrenheit-32);
        return celsius;

    }
}

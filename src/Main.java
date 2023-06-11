import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Cramer's Rule calculator (3X3)\n");
        Scanner sc = new Scanner(System.in);

        // Requisting values from user
        System.out.print("Enter the value of a1 - ");
        float a1= sc.nextFloat();
        System.out.print("Enter the value of a2 - ");
        float a2= sc.nextFloat();
        System.out.print("Enter the value of a3 - ");
        float a3= sc.nextFloat();
        System.out.print("Enter the value of b1 - ");
        float b1= sc.nextFloat();
        System.out.print("Enter the value of b2 - ");
        float b2= sc.nextFloat();
        System.out.print("Enter the value of b3 - ");
        float b3= sc.nextFloat();
        System.out.print("Enter the value of c1 - ");
        float c1= sc.nextFloat();
        System.out.print("Enter the value of c2 - ");
        float c2= sc.nextFloat();
        System.out.print("Enter the value of c3 - ");
        float c3= sc.nextFloat();
        System.out.print("Enter the value of d1 - ");
        float d1= sc.nextFloat();
        System.out.print("Enter the value of d2 - ");
        float d2= sc.nextFloat();
        System.out.print("Enter the value of d3 - ");
        float d3= sc.nextFloat();

        // Using value to get result
        Calc.cramer(a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3);
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {

        int i;
        boolean check;

        System.out.println("-=-=-=- Welcome to the Cramer's Rule calculator -=-=-=-\n");
        System.out.println("Do you want to calculate result for 2 or 3 statements?(2/3)");

        Scanner sc = new Scanner(System.in);

        do {

            i = sc.nextInt();

            if (i == 2) {
                System.out.println("Enter the values for your 2 statements!\n");
                Two twoSum = new Two();
                twoSum.twoStatemets();
                check = true;
            } else if (i == 3) {
                System.out.println("Enter the values for your 3 statements!\n");
                Three threeSum = new Three();
                threeSum.threeStatemets();
                check = true;
            } else {
                System.out.println("Enter either 2 or 3!");
                check = false;
            }
        } while (!check);
    }
}


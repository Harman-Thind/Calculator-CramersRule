import java.util.Scanner;

public class Two {

    public void twoStatemets(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a1 - ");
        float a1= sc.nextFloat();
        System.out.print("Enter the value of a2 - ");
        float a2= sc.nextFloat();
        System.out.print("Enter the value of b1 - ");
        float b1= sc.nextFloat();
        System.out.print("Enter the value of b2 - ");
        float b2= sc.nextFloat();
        System.out.print("Enter the value of d1 - ");
        float d1= sc.nextFloat();
        System.out.print("Enter the value of d2 - ");
        float d2= sc.nextFloat();

        calculation(a1,a2,b1,b2,d1,d2);
    }

    public void calculation(float a1,float a2,float b1,float b2,float d1,float d2){

        float x,y,d,dx,dy;

        System.out.println("Evaluating the result...");

        x = d1 * b2 - d2 * b1;
        y = a1 * d2 - a2 * d1;
        d = a1 * b2 - a2 * b1;

        dx = x / d;
        dy = y / d;

        System.out.println("X = " + dx + ", Y = " + dy);
    }

}

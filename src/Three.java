import java.util.Scanner;

class Three {

    public void threeStatemets(){
        Scanner sc = new Scanner(System.in);

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

        calculation(a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3);
    }
    public void calculation(float a1,float a2,float a3,float b1,float b2,float b3,float c1,float c2,float c3,float d1,float d2,float d3) {

        System.out.println("Evaluating the result...");

        float x,y,z,d,dx,dy,dz;

        x = d1 * b2 * c3 + d3 * b1 * c2 + d2 * b3 * c1 - d3 * b2 * c1 - d1 * b3 * c2 - d2 * b1 * c3;
        y = a1 * d2 * c3 + a3 * d1 * c2 + a2 * d3 * c1 - a3 * d2 * c1 - a1 * d3 * c2 - a2 * d1 * c3;
        z = a1 * b2 * d3 + a3 * b1 * d2 + a2 * b3 * d1 - a3 * b2 * d1 - a1 * b3 * d2 - a2 * b1 * d3;
        d = a1 * b2 * c3 + a3 * b1 * c2 + a2 * b3 * c1 - a3 * b2 * c1 - a1 * b3 * c2 - a2 * b1 * c3;

        dx = x / d;
        dy = y / d;
        dz = z / d;

        System.out.print("\nX = " + dx + ",Y = " + dy + ",Z = " + dz);
    }
}
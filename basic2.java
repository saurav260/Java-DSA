import java.util.Scanner;

public class basic2 {
            public static void main(String[]args) {
            // Average of numbers
        //         int a=5;
        //         int c=5;
        //         int f=5;
        //         int h=(a+c+f)/3;
        //    System.out.println(h);


        // area of square
        // float r=452;
        // float area=r*r;
        // System.out.println(area);


        //GST CAlculate
        Scanner sc =new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        float GST=total*18/100;
        float withGSt=total+GST;
        System.out.println(total);
        System.out.println(withGSt);

        sc.close();
        }
     }
    


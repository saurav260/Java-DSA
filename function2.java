import java.util.*;
public class function2 {
   

   public static void calculateSum(int num1,int num2) { //parameters or formal parameters
        
        int sum=num1+num2;
        System.out.println("Sum is : "+sum);
       
   }
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         sc.close();
       calculateSum(a,b); //arguments or actual parameters

       //Swapping of values
       
    }

}

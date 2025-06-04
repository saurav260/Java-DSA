
import java.util.Scanner;

public class loops {
   public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    //   int counter=0;
    //   while(counter<10){
    //     System.out.println("I love you saurav");
    //     counter ++;
     // }

    //  int counter=1;
    //  while(counter<=10){
    //     System.out.println(counter);
    //     counter ++;
    //  }
    int n=sc.nextInt();
    int i=1;
    int sum=0;
    while(i<=n){
        sum=sum+i;
        i ++;
    }
    System.out.println(sum);

    sc.close();
   } 
}

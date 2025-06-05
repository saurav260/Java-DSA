import java.util.Scanner;
public class dowhileloop {
    public static void main(String []args){
    // int counter=1;
    // do{
    //     System.out.println(counter);
    //     counter++;

    // }
    // while(counter<=10);

    //Break Statement

    // for(int i=1;i<=5;i++){
    //   if(i==3) {
    //     break;
    // }  
    // System.out.println(i);
    // }
    // System.out.println("I am out");

//     Scanner sc  = new Scanner(System.in);
//    do {
//     System.out.println("Enter number");
//     int num=sc.nextInt();
//     if(num%10==0){
//         break;
//     }
//     System.out.println(num);
// }
// while(true);
//   sc.close();  



    //Continue Statement
    // for(int i=0;i<=5;i++){

    //   if(i==3){
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    Scanner sc= new Scanner(System.in);
    do{
      System.out.println("enter your number");
      int i=sc.nextInt();
      if(i%10==0){
        continue;
      }
      System.out.println(i);
       sc.close();
    }
    while(true);
  
  }
}


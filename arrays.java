import java.util.Scanner;

public class arrays {
    public static void main(String [] args){
       
       
        // int [] marks =new int[5];
        // marks[0]=56;
        // marks[1]=99;
        // marks[2]=96;
        // marks[3]=58;
        // marks[4]=55;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // for(int i =0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
         
        //values from user 
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[] = new int[size];

         //input
         for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
         }
         //Question take value from user and give them and find out value
         int x=sc.nextInt();
         
         
         //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index :"+i);
            }
        }


      
     sc.close();
    }
    
    
}

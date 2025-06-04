public class forloop {
    public static void main(String[]args){
        // for(int i=0;i<=10;i++){
        //     System.out.println("Hello World");
        // }
        //Pattern
        // for(int i=1;i<5;i++){
            
        //         System.out.println("****");
            
        // }

        // Reverse
        // int counter =40022172;
        // while(counter>0){
        //     int lastdigit =counter%10;
        //     System.out.print(lastdigit+" ");
        //     counter=counter/10;

         int i=10899;
         int rev =0;
         while(i>0){
            int lastDigit=i%10;
            i =i/10;
            System.out.print(lastDigit+"");
            rev=(rev*10)+lastDigit;
         }
    }
}

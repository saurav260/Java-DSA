public class starpattern1 {
    public static void main(String[]args){
     
        for(int line=1;line<=5;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //Inverted 
         
        for(int line1=1;line1<=4;line1++){
           for(int star1=1;star1<=4-line1+1;star1++ ){
            System.out.print("*"); 
           }
           System.out.println();
        }

        // Character pattern
        int p=4;
        char ch='A';
        //OUTER LOOP
        for(int line=1;line<=p;line++){
         
            //INNER LOOP
            for(int chars=1;chars<=line;chars++){
             System.out.print(ch);
             ch++;
            }
            System.out.println( );
        }
    

    }
}


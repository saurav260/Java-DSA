import java.util.ArrayList;
import java.util.Arrays;

public class stringsbasics {
    public static void main(String []args){
        // String name="Saurav Doke";
        // System.out.println(name);

        // String a="Saurav";
        // String b= "Saurav";
        // System.out.println(a==b); ---->Output : True

        String name1= new String("Saurav");
        String name2= new String("Saurav");
        // System.out.println(name1==name2); --->output: False   (Comparator)
        // System.out.println(name1.equals(name2));   ----> output: True (Method)
        // System.out.println(name1.charAt(3));

        //Operators
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+1));
        System.out.println("SAURAV" + new ArrayList<>());


       //StringBuilder
    //    StringBuilder builder=new StringBuilder();
    //    for(int i=0;i<26;i++){
    //     char a=(char)('a'+i);
    //     builder.append(a);
    //    }
    //    System.out.println(builder.toString());

       //Methods
       String care="SAURAV";

       System.out.println(Arrays.toString(care.toCharArray()));
    }
    
}

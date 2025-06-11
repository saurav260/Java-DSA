import java.util.ArrayList;

public class arrayopesrations {
    public static void main (String[]args){
    ArrayList<Integer> list =  new ArrayList<>();
    
    
    //Add element
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    
    // System.out.println(list);
   
    //  //get element
    //  int element=list.get(2);
    //  System.out.println(element);
    

    //  //delete element
    //  list.remove(2);
    //  System.out.println(list);

    //  //set element at index
    //  list.set(2,10 );
    //  System.out.println(list);

    //  //contains element

    //  list.contains(1);
    //  System.out.println(list);

    //  System.out.println(list.size());

    //  question reverse of array list
    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+ " ");
    }
}
}

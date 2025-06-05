public class function3 {

    public static void swap(int a,int b){
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a :"+a);
        System.out.println("value of b :"+b);

    }
    public static void main(String []args){
        //swapping of two values
        int a=5;
        int b=10;
        swap(a,b); 
        
    }
}

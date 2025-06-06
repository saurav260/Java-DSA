public class functionoverloading {


    //Using Parameter
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    //Using datatypes
    public static int mul(int c,int d){
        return c*d;
    }
    public static float mul(float c, float d){
        return c*d;
    }
    public static void main(String[]args){
     System.out.println(sum(4,5));
     System.out.println(sum(3,3,3));
     System.out.println(mul(3f,2f));
    }
    
}

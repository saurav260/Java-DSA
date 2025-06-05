public class functionsQuestions {
     //Product of two Numbers   
    public static int multiply(int a,int b){
        int product=a*b;
        System.out.println("product is :"+product);

        return product;
    }

    //factorial Of number
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        } 
        System.out.println(f);
        return f;
    }

    public static void main(String []args){
        // int a=3;
        // int b=5;
        // multiply(a, b);
        // multiply(25,30);
       int n=4;
       factorial(n);
       factorial(6);
    }
}

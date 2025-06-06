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
        
        return f;
    }

    //Binomial Coefficient
    public static int binoamialCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);
        int CNR=fact_n/(fact_r * fact_nr);
       
        return CNR;
    }


    public static void main(String []args){
        // int a=3;
        // int b=5;
        // multiply(a, b);
        // multiply(25,30);


      //int n=5;
    //    factorial(n);
    //    factorial(6);
    
   // System.out.println(factorial(n));

    
   System.out.println(binoamialCoeff(5, 2));
     
    
    }
}

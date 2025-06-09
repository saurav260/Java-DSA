public class functionsProblems {
    //Q.1 Average of three numbers
    public static int averageofNum(int a, int b ,int c){
       int avg=(a+b+c)/3;
       System.out.println("Average Of Number is "+avg);
       return avg;
    }
    
    //Q.2 Number is Even or odd
    public static Boolean isEven(int argument){
        boolean isEven;
        if(argument % 2==0){
            isEven=true;
        }
        else{
            isEven=false;            
        }
        System.out.println(isEven);
        return isEven ;
    }

    
    public static void main(String [] args){
       //Q.1
    //     int a=5;
    //    int b=9;
    //    int c=10;
    //    averageofNum(a,b,c);


    //Q.2
     int argument =5;
     isEven(argument);
     isEven(6);
    }
}

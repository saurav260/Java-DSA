public class methodOverloading{
    public static void main(String[] args) {
                //Method Overloading

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum((float)1.2,(float)1.5));
        System.out.println(calc.sum(5,6,7));

        //Method Overriding
        Deer d=new Deer();
        d.eat();
    }
}
    class Calculator{
        int sum(int a,int b){
            return a+b;
        }
        float sum(float a,float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
    }

//Method Overriding
    class Animal{
     void eat(){
        System.out.println("Eats Anything");
     }
     
}
    class Deer extends Animal{
        void eat(){
            System.out.println("Eats Grass");
        }
    }
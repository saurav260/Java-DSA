public class OOPs {
    public static void main(String args[]){
        Pen p1 =new Pen(); //Pen() is called Constructor.We created pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);

        bankAccont myAccount = new bankAccont();
        myAccount.username="Saurav";
        myAccount.setPassword("Saurav@2622");
    }
}
class Pen{
     //properties and functions
     String color;
     int tip;
     String getcolor(){
        return this.color;
     }
     void setColor(String newColor){
        this.color=newColor;
     }

     void setTip(int newTip){
        this.tip=newTip;
     }
}

class Student{
    String name;
    int rollNo;
    int age;
    float percentage;
    String add;

    void calcPercentage(int phy,int maths,int english){
        percentage=(phy+maths+english)/3;



    }
}

class bankAccont{
    public String username;
    private String password;
    int accountNumber;
    public void setPassword(String pwd){

    }

    
}

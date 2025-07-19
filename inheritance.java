public class inheritance {
    public static void main(String[]args){
      Fish shark= new Fish();
      shark.eats();
    }
}

    class Animal{
        String animalName;
        void eats(){
            System.out.println("Animal Eats");
        }
        void breathe(){
            System.out.println("Animals Breathe");
        }
    }
    class Fish extends Animal{
        int fins;
        void swims(){
            System.out.println("Fish swims");
        }
    }


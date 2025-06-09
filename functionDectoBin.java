public class functionDectoBin {

    public static void decToBin(int DecNo){
        int myNum=DecNo;
        int binNo=0;
        int pow=0;
        while(DecNo > 0) {
              int rem =  DecNo % 2;
            binNo = binNo+(rem * (int)Math.pow(10, pow) );
            pow++;
            DecNo=DecNo/2; 
        }
        System.out.println("Binary of Value " +myNum +" is " +binNo);
        return;
    }
     public static void main(String args[]){
      int DecNo=5;
      decToBin(DecNo);
    }
}

public class functionBintodec {


    public static void BinToDec(int binNo){
     int myNum=binNo;   
     int pow=0;
     int decNo=0;

     while (binNo > 0) {
        int LastDigit=binNo % 10;
        decNo = decNo +(LastDigit *(int)Math.pow(2,pow));  //Typecast to integer
        pow++;
        binNo = binNo / 10;
     }
     System.out.println("Decimal number of "+myNum + " is " +decNo);
     return ;
    }
    public static void main(String [] args){
     int binNo=101111;
     BinToDec(binNo);
    }
    
}

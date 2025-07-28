import java.util.*;

public class RecursionBasics {

    public static void PrintDec(int n) {
     if(n==1){
        System.out.print(n);
        return;
     }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintDec(n);
    }
}

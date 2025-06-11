import java.util.Scanner;

public class arrays2d {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int colums=sc.nextInt();

        //Array Declaration
        int numbers[][]=new int[rows][colums];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0; j<colums;j++){
               numbers[i][j]= sc.nextInt();
            }
        }
        //Output

        for(int i=0;i<rows;i++){
            for(int j=0; j<colums;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

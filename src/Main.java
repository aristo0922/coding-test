import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int line, column;
        Scanner scan = new Scanner(System.in);

        line = scan.nextInt();
        column = scan.nextInt();

        int [][] array1 =  new int[line][column];

        for(int i=0; i<line; i++){
            for(int j=0; j<column; j++){
                array1[i][j]=scan.nextInt();
            }
        }

        for(int i=0; i<line; i++){
            for(int j=0; j<column; j++){
                array1[i][j]+=scan.nextInt();
            }
        }

        for(int i=0; i<line; i++){
            for(int j=0;j<column;j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
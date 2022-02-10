package printSquareStar;

public class DiagonalStar {

    public static void printSquareStar(int number){
        if( number < 5) {
            System.out.println("Invalid Value");
            return;
        }else {

        for (int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++){
                if (row == 1 || row == number || col == 1 || col == number){
                    System.out.print("*");
                } else if (row == col) {
                    System.out.print("*");
                } else if (col == (number - row + 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
    }
}
import java.util.Scanner;

public class App {

    public static double arithmeticAverage (double firstScore, double secondScore, double thirdScore) {
        return (firstScore + secondScore + thirdScore) / 3;
    }

    public static void main(String[] args) throws Exception {
        double firstScore, secondScore, thirdScore, finalScore;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("First score: ");
            firstScore = input.nextInt();
            System.out.print("Second score: ");
            secondScore = input.nextInt();
            System.out.print("Third score: ");
            thirdScore = input.nextInt();

            finalScore = arithmeticAverage(firstScore, secondScore, thirdScore);

            System.out.println("Final score: " + finalScore);

            if (finalScore < 3){
                System.out.println("Reproved");
            } else {
                if (finalScore < 7){
                    System.out.println("Final exam");
                } else {
                    System.out.println("Approved");
                }
            }
        }
    }
}

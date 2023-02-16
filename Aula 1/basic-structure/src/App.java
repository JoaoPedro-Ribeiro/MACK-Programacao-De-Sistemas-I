import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Add");
        System.out.println("2 - Sub");
        System.out.println("3 - Mult");
        System.out.println("4 - Leave");
        System.out.print("Option: ");
        option = input.nextInt();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int option = 0;
            double firstNumber, secondNumber;

            while (option != 5){

                option = input.nextInt();

                switch (option){
                    case 1:
                        firstNumber = input.nextDouble();
                        secondNumber = input.nextDouble();
                        System.out.println((firstNumber+secondNumber)/2);
                        break;
                    case 2:
                        firstNumber = input.nextDouble();
                        secondNumber = input.nextDouble();
                        if (firstNumber > secondNumber) {
                            System.out.println(firstNumber-secondNumber);
                        } else {
                            System.out.println(secondNumber-firstNumber);
                        }
                        break;
                    case 3:
                        firstNumber = input.nextDouble();
                        secondNumber = input.nextDouble();
                        System.out.println(firstNumber*secondNumber);
                        break;
                    case 4:
                        firstNumber = input.nextDouble();
                        secondNumber = input.nextDouble();
                        if (secondNumber != 0) {
                            System.out.println(firstNumber/secondNumber);
                        } else {
                            System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                        }
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA");
                }
            }
        }
    }
}

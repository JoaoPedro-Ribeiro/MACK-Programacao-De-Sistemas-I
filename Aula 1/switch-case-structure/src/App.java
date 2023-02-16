import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int jobCode;
        double salary, newSalary;

        try(Scanner input = new Scanner(System.in)){
            System.out.println("What is the job code? ");
            jobCode = input.nextInt();
            System.out.println("What is the salary? ");
            salary = input.nextDouble();

            switch (jobCode){
                case 1:
                    newSalary = salary * 1.5;
                    System.out.println("Position: Escrituário.");
                    System.out.println("Salary increase: 50%, that represents: " + salary * 0.5);
                    System.out.println("New salary: " + newSalary);
                    break;
                case 2:
                    newSalary = salary * 1.35;
                    System.out.println("Position: Secretário.");
                    System.out.println("Salary increase: 35%, that represents: " + salary * 0.35);
                    System.out.println("New salary: " + newSalary);
                    break;
                case 3:
                    newSalary = salary * 1.2;
                    System.out.println("Position: Caixa.");
                    System.out.println("Salary increase: 20%, that represents: " + salary * 0.2);
                    System.out.println("New salary: " + newSalary);
                    break;
                case 4:
                    newSalary = salary * 1.1;
                    System.out.println("Position: Gerente.");
                    System.out.println("Salary increase: 10%, that represents: " + salary * 0.1);
                    System.out.println("New salary: " + newSalary);
                    break;
                case 5:
                    System.out.println("Position: Diretor.");
                    System.out.println("No salary increase.");
                    System.out.println("Salary: " + salary);
                    break;
                default:
                    System.out.println("Invalid job code.");
                    break;

            }
        }
    }
}

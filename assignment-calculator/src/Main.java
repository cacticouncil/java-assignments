import java.util.Scanner;
import java.util.StringTokenizer;


public class Main
{
    private static Scanner keyboard = new Scanner(System.in);

    private static int menu()
    {
        System.out.println("----------------");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Power");
        System.out.println("6) Summation");
        System.out.println("7) Exit");
        System.out.println("----------------");

        int choice = 0;
        while (choice < 1 || choice > 7)
        {
            System.out.print("Choose wisely: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();
        }
        return choice;
    }

    private static double add(double a, double b)
    {
        return a + b;
    }

    private static double subtract(double a, double b)
    {
        return a - b;
    }

    private static double multiply(double a, double b)
    {
        return a * b;
    }

    private static double divide(double numerator, double denominator)
    {
        return numerator / denominator;
    }

    private static double power(double base, int exp)
    {
        double answer = 1;
        for (int i = 0; i < exp; i++)
            answer *= base;
        return answer;
    }

    private static double sum(double[] numbers)
    {
        double answer = 0;
        for (double x : numbers)
            answer += x;
        return answer;
    }

    private static double[] parseNumbers(String csv)
    {
        StringTokenizer tokenizer = new StringTokenizer(csv, ",\n ");
        int count = tokenizer.countTokens();
        double[] numbers = new double[count];

        for (int i=0; i<count; i++)
        {
            String tok = tokenizer.nextToken();
            numbers[i] = Double.parseDouble(tok);
        }

        return numbers;
    }

    public static void main(String[] args)
    {
        boolean forever = true;

        while (forever)
        {
            int command = menu();
            double op1, op2;
            double result = 0;

            switch (command)
            {
                case (1):
                    System.out.print("Operand 1: ");
                    op1 = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Operand 2: ");
                    op2 = keyboard.nextDouble();
                    keyboard.nextLine();
                    result = add(op1, op2);
                    break;
                case (2):
                    System.out.print("Operand 1: ");
                    op1 = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Operand 2: ");
                    op2 = keyboard.nextDouble();
                    keyboard.nextLine();
                    result = subtract(op1, op2);
                    break;
                case (3):
                    System.out.print("Operand 1: ");
                    op1 = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Operand 2: ");
                    op2 = keyboard.nextDouble();
                    keyboard.nextLine();
                    result = multiply(op1, op2);
                    break;
                case (4):
                    System.out.print("Operand 1: ");
                    op1 = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Operand 2: ");
                    op2 = keyboard.nextDouble();
                    keyboard.nextLine();
                    result = divide(op1, op2);
                    break;
                case (5):
                    System.out.print("Base: ");
                    op1 = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("Exponent: ");
                    op2 = keyboard.nextDouble();
                    keyboard.nextLine();
                    result = power(op1, (int)op2);
                    break;
                case (6):
                    System.out.print("Numbers to sum (comma separate): ");
                    String buffer = keyboard.nextLine();
                    double[] numbers = parseNumbers(buffer);
                    result = sum(numbers);
                    break;
                case (7):
                    forever = false;
                    break;
                default:
                    break;
            }

            System.out.printf("Result = %.2f\n", result);
        }

        System.out.println("Thank you for using the Calculon 9001!");
    }
}

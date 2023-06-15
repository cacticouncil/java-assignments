import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // use command line args?
        if (args != null && args.length >= 2)
        {
            action(Integer.valueOf(args[0]), args[1]);
            return;
        }

        System.out.println("Welcome to Programming w/ Stacks!");

        // loop until user says so
        while (true)
        {
            int choice = menu();
            if (choice == 4)
                break;

            // read input expression
            System.out.print("Enter input: ");
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();

            // handle it
            action(choice, input);
        }
    }

    private static int menu()
    {
        System.out.println("------------------------------");
        System.out.println("1) Reverse an expression");
        System.out.println("2) Verify infix expression");
        System.out.println("3) Evaluate postfix expression");
        System.out.println("4) EXIT");
        System.out.println("------------------------------");

        // read user choice with input validation
        Scanner reader = new Scanner(System.in);
        int choice = 4;
        while (true)
        {
            System.out.print("What do you want to do? ");
            String buffer = reader.nextLine();
            try
            {
                choice = Integer.valueOf(buffer);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not a valid choice!");
                continue;
            }
            if (choice >=1 && choice <= 4)
                break;
        }

        return choice;
    }

    private static void action(int choice, String input)
    {
        String output;

        switch (choice)
        {
            case 1:
            {
                output = Reverser.reverse(input);
                break;
            }
            case 2:
            {
                boolean result = InfixVerifier.verify(input);
                output = String.valueOf(result);
                break;
            }
            case 3:
            {
                double result = PostfixEvaluator.evaluate(input);
                output = String.valueOf(result);
                break;
            }
            default:
            {
                output = "";
                break;
            }
        }

        System.out.println(output);
    }
}

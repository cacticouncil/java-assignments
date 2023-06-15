import java.util.Scanner;


public class Main
{
    private static boolean isPrime(int x)
    {
        int i = 2;
        boolean flag = true;

        if (x <= 1)
            flag = false;
        else
        {
            while (i <= (x / 2))
            {
                if (x % i == 0)
                {
                    flag = false;
                    break;
                }
                i = i + 1;
            }
        }

        return flag;
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("Prime Checker 2000!");
        System.out.print("Please enter an integer: ");
        int query = reader.nextInt();

        boolean prime = isPrime(query);

        System.out.print(query);
        if (prime)
            System.out.println(" is a prime number.");
        else
            System.out.println(" is not prime.");
    }
}

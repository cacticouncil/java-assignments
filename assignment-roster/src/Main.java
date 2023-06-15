import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numStudents = 0;

        // read in the number of students (with input validation)
        while (true)
        {
            System.out.print("How many students? ");
            try
            {
                numStudents = reader.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                // do nothing, just eat exception
            }
            finally
            {
                // always eat everything up to the newline on the input stream
                reader.nextLine();
            }
        }

        // this is our list of students
        Student[] students = new Student[numStudents];

        // create new student objects/instance for each student
        for (int i=0; i<numStudents; i++)
        {
            System.out.printf("Student %d's name: ", (i+1));
            String nametag = reader.nextLine();
            students[i] = new Student(nametag);
        }

        // print class roster
        System.out.println();
        System.out.println("Roster:");
        for (Student s : students)
        {
            System.out.print(s);
            if (s.getGrade() < 65)
                System.out.print(" <----- needs help!");
            System.out.println(); // end line
        }
    }
}

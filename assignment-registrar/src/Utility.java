import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class Utility
{
    public static void main(String[] args)
    {
        if (args.length == 2)
        {
            int count = Integer.valueOf(args[0]);
            String filename = args[1];
            generateStudents(count, filename);
        }
    }

    public static void generateStudents(int howMany, String filename)
    {
        File file = new File(filename);
        if (!file.exists())
            file.getParentFile().mkdirs();

        try
        {
            Random prng = new Random();
            FileWriter writer = new FileWriter(filename);
            String[] firsts =
            {
                "John", "Kerry", "George", "Sarah", "David", "Mark",
                "Kim", "Bella", "Jerry", "Dylan", "Daveed", "Justin",
                "Mike", "Kevin", "Andy", "Chi", "Jesus", "Abdulla",
                "Youseef", "Lafti", "Zen", "Mario", "Chico", "Ellis",
                "Britney", "Bianca", "Bernard", "Manny", "Cosmo", "Eli",
                "Peyton", "Leo", "Lucky", "Anders", "Bryan", "Brian",
                "Greg", "Jose", "Jenny", "Joseph", "Linda", "Helen",
                "Dillon", "Tom", "Thomas", "Susan", "Suzan", "Steven",
                "Stephen", "James", "John", "Robert", "Michael", "William",
                "David", "Richard", "Joseph", "Thomas", "Charles", "Chris",
                "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark",
                "Paul", "Steven", "Andrew", "Kenneth", "Joshua", "Kevin",
                "Brian", "George", "Edward", "Ronald", "Timothy", "Jason",
                "Jeffrey", "Ryan", "Jacob", "Gary", "Nicholas", "Eric",
                "Jonathan", "Stephen", "Larry", "Justin", "Scott", "Brandon",
                "Benjamin", "Samuel", "Frank", "Gregory", "Raymond",
                "Alexander", "Patrick", "Jack", "Dennis", "Jerry", "Tyler",
                "Aaron", "Jose", "Henry", "Adam", "Douglas", "Nathan", "Peter",
                "Zachary", "Kyle", "Walter", "Harold", "Jeremy", "Ethan", "Carl",
                "Keith", "Roger", "Kira", "Kris", "Jenni", "Bobbie", "Jess",
                "Mary", "Kristen", "Julie", "Morgan", "Stephanie", "Judzia",
                "Perry", "Garak", "Garreth", "Adam", "Margaret", "Nana",
                "Joan", "Jeri", "Kes", "Link", "Andres", "Joshua", "Jeremiah",
                "Meridith", "Glenadina", "Rachel", "Kaley"
            };
            String[] lasts =
            {
                "Yue", "Si", "Kerry", "Davids", "Vasquez", "Gold", "Goldberg", "Shafir",
                "Erfani", "Delarocca", "Johnson", "Vogel", "Smith", "Locke",
                "Falkowski", "Vincenzo", "Tornatore", "Hansen", "Takada",
                "Almaturi", "Plainte", "Fiasa", "Kesh", "Shumaker", "Hughes",
                "Kider", "Greenspan", "Niccola", "Fauci", "Truce", "Quintero",
                "Davidson", "Murphy", "Castle", "Jones", "Pancer", "Forte",
                "Torke", "Jefferys", "Cook", "Nieson", "DeLeon", "Elk",
                "Goldstein", "Madson", "Misten", "Meare", "Nelson", "Zadeh",
                "Charriez", "Guiterrez", "Indra", "Oswalt", "Gaff", "King",
                "Crispen", "Doherty", "Principe", "Restrepo", "Evans",
                "Holiday", "Harrison", "Starling", "Baker", "Forge",
                "Rapier", "Pierre", "Kardish", "Velti", "Gonzalez", "Kearny",
                "Peterson", "Monteblanc", "Honda", "Bailey", "Sharpe", "Han",
                "Skywalker", "Lucas", "Bottoms", "Gaudette", "Silvers",
                "Potter", "Snape", "Takeshi", "Guo", "Shatner", "Kirk",
                "Picard", "Riker", "Nerise", "Bashir", "Cisco", "Grainger",
                "Herman", "O'Hare", "O'Reilly", "Dax", "Prince", "Adams",
                "Martins", "Kummery", "Colimar", "Cologne", "Bahin", "Hinders",
                "Eisenmenger", "Pratchet", "McGinty", "O'Brien", "Perez"
            };
            String[] domains =
            {
                "gmail.com", "hotmail.com", "yahoo.com", "snailmail.com",
                "aol.com", "comcast.net", "msn.com", "pobox.net"
            };

            int id;
            String first;
            String last;
            String email;
            float gpa;
            LocalDate since;
            LocalDate dateStart = LocalDate.of(2014, 1, 1);
            LocalDate dateEnd = LocalDate.now();
            Set<Integer> ids = new HashSet<>();

            writer.write(String.valueOf(howMany) + "\n");

            for (int i=0; i<howMany; i++)
            {
                while (true)
                {
                    id = 80000000 + prng.nextInt(100000);
                    if (!ids.contains(id))
                    {
                        ids.add(id);
                        break;
                    }
                }
                first = firsts[prng.nextInt(firsts.length)];
                last = lasts[prng.nextInt(lasts.length)];
                gpa = prng.nextFloat() * 4.0f;
                email = first.charAt(0) + "." + last + "@" + domains[prng.nextInt(domains.length)];
                email = email.toLowerCase();
                since = randomDate(dateStart, dateEnd);
                writer.write(id + ",");
                writer.write(first + ",");
                writer.write(last + ",");
                writer.write(since + ",");
                writer.write(gpa + ",");
                writer.write(email + "\n");
            }

            writer.close();
        }
        catch (Exception ex)
        {
            System.err.println("Could not generate students!");
            System.err.println(ex);
        }
    }

    public static LocalDate randomDate(LocalDate start, LocalDate end)
    {
        long startEpochDay = start.toEpochDay();
        long endEpochDay = end.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static void addGBComponent(Container parent, Component comp, int x, int y, int w, int h)
    {
        addGBComponent(parent, comp, x, y, w, h, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 1, 1, 0, 0, 0, 0);
    }

    public static void addGBComponent(Container parent, JComponent comp, int x, int y, int w, int h, int i)
    {
        addGBComponent(parent, comp, x, y, w, h, GridBagConstraints.BOTH, GridBagConstraints.CENTER, 1, 1, i, i, i, i);
    }

    public static void addGBComponent(Container parent, Component comp, int x, int y, int w, int h, int f, int i)
    {
        addGBComponent(parent, comp, x, y, w, h, f, GridBagConstraints.CENTER, 1, 1, i, i, i, i);
    }

    public static void addGBComponent(Container parent, Component comp, int x, int y, int w, int h, int f, int a, double wx, double wy, int it, int il, int ib, int ir)
    {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbc.weightx = wx;
        gbc.weighty = wy;
        gbc.fill = f;
        gbc.anchor = a;
        gbc.insets = new Insets(it, il, ib, ir);
        parent.add(comp, gbc);
    }
}

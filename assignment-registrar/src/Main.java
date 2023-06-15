import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Main extends JFrame
{
    public static final String DataStudents = "res/students.csv";
    public static final ImageIcon[] DefAvatars = new ImageIcon[]
    {
        new ImageIcon(new ImageIcon("res/avatar1.png").getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)),
        new ImageIcon(new ImageIcon("res/avatar2.png").getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)),
        new ImageIcon(new ImageIcon("res/avatar3.png").getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)),
        new ImageIcon(new ImageIcon("res/avatar4.png").getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)),
        new ImageIcon(new ImageIcon("res/avatar5.png").getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)),
    };
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(
            new Thread()
            {
                public void run()
                {
                    Main app = new Main();
                    app.setLocationRelativeTo(null);
                    app.setVisible(true);
                }
            }
        );
    }

    public Main()
    {
        initGUI();
    }

    private void initGUI()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setTitle("University Registrar");
        //setIconImage(new ImageIcon("res/icon.png").getImage());
        //setSize(800, 600);
        setResizable(true);
        //setLayout(new GridBagLayout());

        
    }
}

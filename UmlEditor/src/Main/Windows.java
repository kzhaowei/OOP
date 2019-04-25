package Main;

import Button.*;
import javax.swing.*;
import java.awt.*;

public class Windows {

    private JFrame MainFrame = new JFrame("UMLEditor");
    private int WindowsWidth=800;
    private int WindowsHeight=550;

    private JPanel LeftJpanel = new JPanel();
    private  MyJpanel RightJpanel = new MyJpanel();

    private ButtonContainer MyButton = new ButtonContainer(RightJpanel);

    private MyMenubar MyMenuBar = new MyMenubar(RightJpanel);






    public Windows(){
        MainFrame.setSize(WindowsWidth,WindowsHeight);
        MainFrame.setLocationRelativeTo(null);
        LeftJpanel.setPreferredSize(new Dimension(100,100));
        MyButton.AddButtonToJPanel(LeftJpanel);
        LeftJpanel.setLayout(new GridLayout(6,1));





        MainFrame.setJMenuBar(MyMenuBar);



        MainFrame.add(LeftJpanel, BorderLayout.WEST);
        MainFrame.add(RightJpanel, BorderLayout.CENTER);

        MainFrame.setVisible(true);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}

package Main;

import javax.swing.*;

import Shape.Basic_obj;
import Shape.Group;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenubar extends JMenuBar {
    private JMenuItem ItemGroup= new JMenuItem("Group");
    private JMenuItem ItemUnGroup= new JMenuItem("UnGroup");
    private JMenuItem ItemRename= new JMenuItem("Rename");
    private JMenu MyMenu = new JMenu("Edit");
    private MyJpanel MyJpanel;
    private Group MyGroup=new Group();
    public MyMenubar(MyJpanel m){
        super();
        MyJpanel=m;
        MyMenu.add(ItemGroup);
        MyMenu.add(ItemUnGroup);
        MyMenu.add(ItemRename);
        this.add(MyMenu);
        ItemGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MyGroup=new Group(MyJpanel.ObjectList);
                Basic_obj m =MyGroup.Merge();
                MyJpanel.ObjectList.add(m);
                for(Basic_obj s:MyJpanel.ObjectList)System.out.println(s.x);
                MyJpanel.repaint();
            }

        });
        ItemUnGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Basic_obj n =  new Basic_obj();
                for(Basic_obj s:MyJpanel.ObjectList){
                    if(s.isGroup==true){
                        n=s;
                    }
                }
                n.ChangeGroup();
                MyJpanel.ObjectList.remove(n);
                for(Basic_obj s:MyJpanel.ObjectList){
                    if(s.name.equals("G"))
                    s.CheckGroup();
                }


                MyJpanel.repaint();
            }


        });
        ItemRename.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(null,"Rename");
                System.out.println(name);
                if(MyJpanel.CheckObject.size()==1){
                    MyJpanel.CheckObject.get(0).name=name;
                    System.out.println(MyJpanel.CheckObject.get(0).name);
                }
                MyJpanel.repaint();

            }

        });
    }


}

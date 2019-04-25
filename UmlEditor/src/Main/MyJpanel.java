package Main;

import Mode.Mode;
import Shape.*;

import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import Button.*;


public class MyJpanel extends JPanel {

    private BufferedImage image;

    public ArrayList<Basic_obj> ObjectList = new ArrayList<Basic_obj>();
    private Mode MyJpanel_Listener =new Mode();
    public ArrayList<MyButton> MyButtonList;
    public ArrayList<Basic_obj> CheckObject = new ArrayList<Basic_obj>();
    public Basic_obj MySelectRect = new Basic_obj();

    public ArrayList<Lines> LinesList = new ArrayList<Lines>();

    public int MouseStartX=0;
    public int MouseStartY=0;
    public MyJpanel()  {
        super();

        try {
            image = ImageIO.read(new File("images/39.jpg"));
        }catch (IOException io){}

        this.setBackground(Color.lightGray);

    }
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);

        g.drawImage(image, 0, 0, this);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(2));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.8f));
        for(Basic_obj s:ObjectList){

            s.draw(g2);
        }

        for (MyShape s:LinesList){
            s.draw(g2);
        }
        Shape w = new Rectangle2D.Double(MySelectRect.x,MySelectRect.y,MySelectRect.width,MySelectRect.height);

        g2.setPaint(Color.BLACK);
        g2.draw(w);

    }
    public void ChangeMode(Mode m){
        removeMouseListener(MyJpanel_Listener);
        removeMouseMotionListener(MyJpanel_Listener);
        MyJpanel_Listener=m;
        System.out.println(m.getClass().getName());
        addMouseListener(MyJpanel_Listener);
        addMouseMotionListener(MyJpanel_Listener);
    }
    public void InsertObject2List(Basic_obj g){
        ObjectList.add(g);
    }
    public void ChangeButtonIcon(MyButton o){
        for(MyButton a:MyButtonList){
            a.isSelect=false;
        }
        o.isSelect=true;
        for(MyButton a:MyButtonList){
            a.ChangeButtonIcon();
        }
    }
    public ArrayList<Basic_obj> GetObjectList(){
        return ObjectList;
    }


}

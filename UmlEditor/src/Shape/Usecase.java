package Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Usecase extends Basic_obj {
    public Usecase(int x,int y,int width,int height,String name){
        super(x,y,width,height,name);


    }
    @Override
    public void draw(Graphics2D g){

        Shape s = new Ellipse2D.Double(x, y, width, height);
        g.setPaint(Color.white);
        g.fill(s);
        g.setPaint(Color.black);
        g.draw(s);
        g.drawString(name, x + width / 4, y + height / 2);
        g.setColor(Color.BLUE);
        super.draw(g);


    }

}

package Shape;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class UML_Class extends Basic_obj {
    public UML_Class(int x,int y,int width,int weight,String name){
        super(x,y,width,weight,name);
    }
    public void draw(Graphics2D g){

        Shape w = new Rectangle2D.Double(x, y, width, height);
        Shape L1 = new Line2D.Double(x, y + height / 3, x + width, y + height / 3);
        Shape L2 = new Line2D.Double(x, y + height / 3 * 2, x + width, y + height / 3 * 2);
        g.setPaint(Color.white);
        g.fill(w);
        g.setPaint(Color.black);
        g.draw(w);
        g.draw(L1);
        g.draw(L2);
        g.drawString(name, x + width / 4, y + height / 6);
        super.draw(g);


    }
}

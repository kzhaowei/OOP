package Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Basic_obj extends MyShape {

    public Basic_obj(){}
    public Basic_obj(int x,int y,int width,int height,String name){
        super(x,y,width,height,name);
        MyPort = new Port(x,y,width,height);
        this.isGroup=false;

    }
    @Override
    public void draw(Graphics2D g){
        if(isSelect && !isGroup) {
            g.setPaint(Color.BLACK);

            for (Point a : MyPort.MyPoint) {

                g.draw(new Rectangle2D.Double(a.x, a.y, MyPort.size, MyPort.size));

            }
        }
    }
    @Override
    public void resetPosition(int x,int y){
        this.x=x;
        this.y=y;
        MyPort.updatePort(x,y);

    }
    public void setRect(int x, int y ,int width,int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public void ChangeGroup(){

    }
    public void CheckGroup(){

    }

}


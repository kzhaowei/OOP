package Shape;

import java.awt.*;
import java.util.ArrayList;

public class Port {
    public ArrayList<Point> MyPoint = new ArrayList<Point>();
    public int size=5;
    public int x;
    public int y;
    public int width;
    public int height;
    public Port(){}

    public Port(int xx,int yy,int width,int height){
        x=xx;
        y=yy;
        this.width=width;
        this.height=height;





        MyPoint.add(new Point(x+width/2,y-size/2));
        MyPoint.add(new Point(x+width/2,y+height-size/2));

        MyPoint.add(new Point(x-size/2,y+height/2-size/2));
        MyPoint.add(new Point(x-size/2+width,y+height/2-size/2));



    }
    public void updatePort(int x,int y){
        MyPoint.set(0,new Point(x+width/2,y-size/2));
        MyPoint.set(1,new Point(x+width/2,y+height-size/2));
        MyPoint.set(2,new Point(x-size/2,y+height/2-size/2));
        MyPoint.set(3,new Point(x-size/2+width,y+height/2-size/2));



    }


}

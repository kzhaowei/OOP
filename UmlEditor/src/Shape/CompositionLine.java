package Shape;

import java.awt.*;
import java.awt.geom.Line2D;

public class CompositionLine extends Lines {
    public CompositionLine(Port a,int x,Port b,int y){
        super(a,x,b,y);
    }

    @Override
    public void draw(Graphics2D g) {
        StartPoint = StartPort.MyPoint.get(StartIndex);
        EndPoint = EndPort.MyPoint.get(EndIndex);
        int tempx=EndPoint.x;
        int tempy=EndPoint.y;
        int TriangleSize=8;
        double x=EndPoint.x-StartPoint.x;
        double y=EndPoint.y-StartPoint.y;
        double Long = Math.sqrt(x*x+y*y);
        x/=Long;
        y/=Long;
        Shape s= new Line2D.Double(StartPoint.x, StartPoint.y,EndPoint.x,EndPoint.y);
        Shape t = new Polygon(
                new int[]{(int)(tempx+TriangleSize*x*Math.sqrt(3)),(int)(tempx+TriangleSize*y),(int)(tempx-TriangleSize*x*Math.sqrt(3)),(int)(tempx-TriangleSize*y)},
                new int[]{(int)(tempy+TriangleSize*y*Math.sqrt(3)),(int)(tempy-TriangleSize*x),(int)(tempy-TriangleSize*y*Math.sqrt(3)),(int)(tempy+TriangleSize*x)},4);
        g.setPaint(Color.BLACK);
        g.draw(s);
        g.fill(t);
        g.draw(t);
    }
}

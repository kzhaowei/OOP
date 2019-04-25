package Shape;

        import java.awt.*;
        import java.awt.geom.Line2D;

public class AssociationLine extends Lines {
    public AssociationLine(Port a,int x,Port b,int y){
        super(a,x,b,y);
    }

    @Override
    public void draw(Graphics2D g) {
        StartPoint = StartPort.MyPoint.get(StartIndex);
        EndPoint = EndPort.MyPoint.get(EndIndex);
        Shape s= new Line2D.Double(StartPoint.x, StartPoint.y,EndPoint.x,EndPoint.y);
        g.setPaint(Color.BLACK);
        g.draw(s);
    }
}

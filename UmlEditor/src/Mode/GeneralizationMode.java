package Mode;

import Main.MyJpanel;
import Shape.Basic_obj;
import Shape.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;

public class GeneralizationMode extends Mode {
    private MyJpanel MyJpanel;
    private int StartX;
    private int StartY;
    private int EndX;
    private int EndY;
    private Basic_obj Start;
    private Basic_obj End;
    private int S;
    private int E ;
    private ArrayList<Point> MyPoint;


    public GeneralizationMode(MyJpanel m){
        this.MyJpanel=m;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        StartX=e.getX();
        StartY=e.getY();
        for(Basic_obj i: MyJpanel.ObjectList) {
            if(i.x<StartX && i.x+i.width>StartX && i.y<StartY &&i.y+i.height>StartY &&!i.isGroup){
                Start=i;
                S=CheckPort(i,StartX,StartY);
            }
        }

        e.getComponent().repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        EndX=e.getX();
        EndY=e.getY();
        for(Basic_obj j: MyJpanel.ObjectList) {
            if(j.x<EndX && j.x+j.width>EndX && j.y<EndY && j.y+j.height>EndY && !j.isGroup ){
                End=j;
                E=CheckPort(j,EndX,EndY);
            }
        }
        if(Start!=null && End!=null&&!Start.equals(End) ){
            MyJpanel.LinesList.add(new GeneralizationLine(Start.MyPort,S,End.MyPort,E));


        }


        e.getComponent().repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseWheelMoved(MouseWheelEvent e){}

    @Override
    public void mouseDragged(MouseEvent e){}

    @Override
    public void mouseMoved(MouseEvent e){}

    public int CheckPort(MyShape i,int x,int y){
        int p[][]={{1,2},{3,0}};
        Point Center=new Point(0,0);
        MyPoint=i.MyPort.MyPoint;
        for(Point a:MyPoint){
            Center.x+=a.getX()/4;
            Center.y+=a.getY()/4;
        }

        x-=Center.x;
        y-=Center.y;
        i.index=p[y-x>0?0:1][y+x>0?0:1];
        return i.index;






    }
}

package Mode;


import Main.*;
import Shape.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class SelectMode extends Mode {
    private MyJpanel MyJpanel;

    public SelectMode(MyJpanel m){
        this.MyJpanel=m;

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        MyJpanel.MouseStartX=e.getX();
        MyJpanel.MouseStartY=e.getY();
        Basic_obj MyObj = new Basic_obj();
        MyJpanel.CheckObject.clear();

        ArrayList<Basic_obj> ObjectList = MyJpanel.GetObjectList();
        for (Basic_obj a : ObjectList){
            if(x > a.x && x < a.x+a.width
                    && y>a.y && y<a.y+a.height
                    && x>0 && y>0){
                MyObj=a;
            }

        }
        MyObj.isSelect=true;
        if(MyObj.x!=0){
            MyJpanel.CheckObject.add(MyObj);
        }
        e.getComponent().repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int StartX=MyJpanel.MouseStartX;
        int StartY=MyJpanel.MouseStartY;
        int EndX=e.getX();
        int EndY=e.getY();

        MyJpanel.CheckObject.clear();
        ArrayList<Basic_obj> ObjectList = MyJpanel.GetObjectList();
        for (Basic_obj a : ObjectList){
            if(a.x>StartX && a.x<EndX && a.y>StartY && a.y<EndY ||
               a.x>EndX && a.x <StartX && a.y>EndY && a.y<StartY  ||
               a.x<EndX && a.x+a.width>EndX && a.y<EndY && a.y+a.height>EndY && EndX>0 && EndY>0 ){

                a.isSelect=true;
                MyJpanel.CheckObject.add(a);
            }else{
                a.isSelect=false;
            }

        }
        MyJpanel.MySelectRect=new Basic_obj();
        e.getComponent().repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e){
        for(MyShape a :MyJpanel.CheckObject){
            a.resetPosition(e.getX()-a.width/2,e.getY()-a.height/2);
        }
        int StartX=MyJpanel.MouseStartX;
        int StartY= MyJpanel.MouseStartY;
        int EndX=e.getX();
        int EndY=e.getY();
        if(MyJpanel.CheckObject.size()==0)
            MyJpanel.MySelectRect.setRect(StartX,StartY,EndX-StartX,EndY-StartY);
        e.getComponent().repaint();
    }


}

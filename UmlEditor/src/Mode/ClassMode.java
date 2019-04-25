package Mode;
import Main.MyJpanel;
import Shape.*;
import java.awt.event.MouseEvent;

public class ClassMode extends Mode {
    private MyJpanel MyJpanel;
    public ClassMode(MyJpanel m){
        super();
        this.MyJpanel=m;
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Basic_obj u = new UML_Class(e.getX(),e.getY(),70,100,"Class");
        MyJpanel.InsertObject2List(u);
        MyJpanel.ChangeMode(this);
        e.getComponent().repaint();
    }


}

package Mode;
import Main.MyJpanel;
import Shape.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class UsecaseMode extends Mode {
    private MyJpanel MyJpanel;
    public UsecaseMode(MyJpanel m){
        super();
        this.MyJpanel=m;

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Basic_obj u = new Usecase(e.getX(),e.getY(),100,50,"UseCase");
        MyJpanel.InsertObject2List(u);
        MyJpanel.ChangeMode(this);
        e.getComponent().repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

   @Override
    public void mouseWheelMoved(MouseWheelEvent e){}

    @Override
    public void mouseDragged(MouseEvent e){}

    @Override
    public void mouseMoved(MouseEvent e){}
}

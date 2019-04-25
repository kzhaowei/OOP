package Button;

import Mode.AssociationMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssociationButton extends MyButton{

    public AssociationButton(MyJpanel m){
        super("images/line.png","images/line_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new AssociationMode(m));
                m.ChangeButtonIcon(getthis());
            }
        });
    }
}

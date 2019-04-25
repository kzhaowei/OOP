package Button;

import Mode.CompositionMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompositionButton extends MyButton {
    public CompositionButton(MyJpanel m){

        super("images/comp.png","images/comp_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new CompositionMode(m));
                m.ChangeButtonIcon(getthis());

            }
        });
    }
}

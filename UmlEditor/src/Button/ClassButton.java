package Button;

import Mode.ClassMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassButton extends MyButton {

    public ClassButton(MyJpanel m){
        super("images/class.png","images/class_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new ClassMode(m));
                m.ChangeButtonIcon(getthis());

            }
        });
    }

}

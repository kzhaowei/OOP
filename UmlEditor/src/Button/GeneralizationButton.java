package Button;

import Mode.GeneralizationMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralizationButton extends MyButton {

    public GeneralizationButton(MyJpanel m){

        super("images/gen.png","images/gen_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new GeneralizationMode(m));
                m.ChangeButtonIcon(getthis());

            }
        });
    }
}

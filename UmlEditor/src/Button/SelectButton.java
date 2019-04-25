package Button;

import Mode.SelectMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectButton extends MyButton {

    public SelectButton(MyJpanel m){
        super("images/arrow.png","images/arrow_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new SelectMode(m));
                m.ChangeButtonIcon(getthis());

            }
        });


    }


}

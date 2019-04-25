package Button;



import Mode.UsecaseMode;
import Main.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UsecaseButton extends MyButton {


    public UsecaseButton(MyJpanel m){
        super("images/use.png","images/use_R.png");
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                m.ChangeMode(new UsecaseMode(m));
                m.ChangeButtonIcon(getthis());
            }
        });

    }




}

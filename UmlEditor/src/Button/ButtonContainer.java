package Button;

import javax.swing.*;
import Main.*;
import java.util.ArrayList;

public class ButtonContainer {
    private ArrayList<MyButton> ButtonList  = new ArrayList<MyButton>();
    private MyJpanel MyJpanel;

    public ButtonContainer(MyJpanel m){
        this.MyJpanel=m;

        ButtonList.add(new SelectButton(m));
        ButtonList.add(new AssociationButton(m));
        ButtonList.add(new GeneralizationButton(m));
        ButtonList.add(new CompositionButton(m));
        ButtonList.add(new ClassButton(m));
        ButtonList.add(new UsecaseButton(m));
        this.MyJpanel.MyButtonList=ButtonList;
    }
    public void AddButtonToJPanel(JPanel j){
        for (int i = 0; i< ButtonList.size(); i++){

            j.add(ButtonList.get(i));
        }
    }


}
package Button;

import javax.swing.*;

public class MyButton extends JButton {
    public boolean isSelect;
    public ImageIcon icon ;
    public ImageIcon icon2;
    public MyButton(){

    }
    public MyButton(String a,String b){
        icon = new ImageIcon(a);
        icon2 = new ImageIcon(b);
    }
    public void ChangeButtonIcon(){
        setIcon(isSelect==false ? icon:icon2);

    }
    public MyButton getthis(){
        return this;
    }

}

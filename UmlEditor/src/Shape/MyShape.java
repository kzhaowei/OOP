package Shape;

import java.awt.*;

public class MyShape  {
    public int x=0;
    public int y=0;
    public int width=0;
    public int height=0;
    public String name="";
    public boolean isSelect;
    public boolean isGroup;
    public int index;
    public Port MyPort = new Port();
    public MyShape(){}
    public MyShape(int x,int y,int width,int height,String name){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.name=name;
        this.isSelect=false;
        this.isGroup=false;

    }


    public void draw(Graphics2D g){
        }
    public void resetPosition(int x,int y){

    }


}

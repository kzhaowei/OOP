package Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Group extends Basic_obj {
    public ArrayList<Basic_obj> Group = new ArrayList<Basic_obj>();
    private ArrayList<Basic_obj> ObjList = new ArrayList<Basic_obj>() ;
    private int biasx;
    private int biasy;
    public Group(){}
    public Group(ArrayList<Basic_obj> m){
        super(0,0,0,0,"G");
        this.ObjList=m;
        this.isGroup=true;
    }
    public Basic_obj Merge(){
        int Min_x=2147483647;
        int Min_y=2147483647;
        int Max_x=0;
        int Max_y=0;
        for(Basic_obj s:ObjList){
            if(s.isSelect) {
                s.isSelect=false;
                s.isGroup=true;
                Group.add(s);
                if (Min_x > s.x) Min_x = s.x;
                if (Min_y > s.y) Min_y = s.y;
                if (Max_x < s.x+s.width) Max_x = s.x+s.width;
                if (Max_y < s.y+s.height) Max_y = s.y+s.height;
            }
        }
        if(Group.size()==1){
            Group.get(0).isGroup=false;
            Group.get(0).isSelect=true;
            Group.clear();
        }else{
            this.x=Min_x-20;
            this.y=Min_y-20;
            this.width=Max_x-Min_x+40;
            this.height=Max_y-Min_y+40;
        }

        return this;
    }

    @Override
    public void draw(Graphics2D g){
            Shape w = new Rectangle2D.Double(x, y, width, height);
            g.setPaint(Color.black);
            g.draw(w);

    }
    @Override
    public void resetPosition(int x,int y){

        biasx=x-this.x;
        biasy=y-this.y;

        this.x=x;
        this.y=y;
        for(Basic_obj s:Group){
            s.x+=biasx;
            s.y+=biasy;
            s.MyPort.updatePort(s.x,s.y);
        }
    }
    @Override
    public void ChangeGroup(){
        for(Basic_obj s:Group) {
            if(!s.name.equals("G"))
                s.isGroup = false;
        }

    }
    @Override
    public void CheckGroup(){
        for(Basic_obj s:Group){
            s.isGroup=true;
        }
    }

}

package Shape;

import java.awt.*;
public class Lines extends MyShape {

    public Point StartPoint;
    public Point EndPoint;
    public Port StartPort;
    public Port EndPort;
    public int StartIndex;
    public int EndIndex;
    public int endx;
    public int endy;


    public Lines(Port a,int x,Port b,int y){
        StartPort=a;
        EndPort=b;
        StartIndex=x;
        EndIndex=y;

    }
    @Override
    public void draw(Graphics2D g){

    }



}

package models;

import static java.lang.Math.*;
import static java.lang.StrictMath.cos;

public class Schientific extends MyMath{

    public Schientific(double x, double y){
        super(x,y);
    }

    public double squareroot(){
        return sqrt(getX());
    }

    public double mySin(){
        return sin(getX());
    }

    public double myCos(){
        return cos(getX());
    }

    public double myTan(){
        return tan(getX());
    }

    public double mySec(){
        return 1/sin(getX());
    }

    public double myCot(){
        return 1/tan(getX());
    }

    public double mycsc(){
        return 1/cos(getX());
    }
}

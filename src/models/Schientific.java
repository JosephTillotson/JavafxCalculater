package models;

import static java.lang.Math.*;
import static java.lang.StrictMath.cos;

public class Schientific extends MyMath{

    public Schientific(double x){
        super(x);
    }

    public Schientific(double x, double y){
        super(x,y);
    }

    public double squareroot(){
        return sqrt(getX());
    }

    public double squareroot(double x){
        return sqrt(x);
    }

    public double mySin(){
        return sin(getX());
    }

    public double mySin(double x){
        return sin(x);
    }

    public double myCos(){
        return cos(getX());
    }

    public double myCos(double x){
        return cos(x);
    }

    public double myTan(){
        return tan(getX());
    }

    public double myTan(double x){
        return tan(x);
    }

    public double mySec(){
        return 1/sin(getX());
    }

    public double mySec(double x){
        return 1/sin(x);
    }

    public double myCot(){
        return 1/tan(getX());
    }

    public double myCot(double x){
        return 1/tan(x);
    }

    public double mycsc(){
        return 1/cos(getX());
    }

    public double mycsc(double x){
        return 1/cos(x);
    }
}

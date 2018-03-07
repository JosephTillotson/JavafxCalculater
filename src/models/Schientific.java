package models;

import static java.lang.Math.*;
import static java.lang.StrictMath.cos;

public class Schientific extends MyMath{
    /**
     * Basic constructer
     */
    public Schientific(){}

    /**
     * Will square root any function
     * @param x the number to be rooted
     * @return Will return the answer
     */
    public double squareroot(double x){
        return sqrt(x);
    }


    /**
     * This will take the sin of the answer
     * @param x the number to be sined?
     * @return returnt he sin of the value
     */
    public double mySin(double x){
        return sin(x);
    }

    /**
     * Will do the cos of a number
     * @param x The valued to be cosined?
     * @return the value of the number cosed
     */

    public double myCos(double x){
        return cos(x);
    }


    /**
     * will to the tan of the number
     * @param x the number to be taned
     * @return return the value
     */
    public double myTan(double x){
        return tan(x);
    }

    /**
     * will do the secant of the value
     * @param x will be the number
     * @return return the value
     */

    public double mySec(double x){
        return 1/sin(x);
    }

    /**
     * Will do the cot of a value
     * @param x number to be cot
     * @return return the value
     */

    public double myCot(double x){
        return 1/tan(x);
    }

    /**
     * will to the cosecant of the number
     * @param x the number
     * @return return the value
     */

    public double mycsc(double x){
        return 1/cos(x);
    }
}

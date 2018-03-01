package models;

public class Equations {

   BasicCalculater bs=new BasicCalculater();
   Schientific sc= new Schientific();

    public double standardeq(double a, double x, double b, double y){

        return a*x+b*y;
    }

    public double slopeIntercept(double m, double x, double b){
        return m*x+b;
    }

    public double slope(double y2, double y1, double x2, double x1){
        return (y2-y1)/(x2-x1);
    }

    public double DistanceFormula(double x2, double x1, double y2, double y1){
        double answer;
        double xanswer;
        double yanswer;
        xanswer= x2-x1;
        xanswer=bs.exponents(xanswer, 2);
        yanswer=y2-y1;
        yanswer=bs.exponents(yanswer, 2);
        answer=xanswer+yanswer;
        return sc.squareroot(answer);
    }

    public String midpointFormula(double x1, double x2, double y1, double y2){
        return "("+(x1+x2)/2+","+(y1+y2)/2+")";
    }

}

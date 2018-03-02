package models;

public class Physics extends MyMath {
    BasicCalculater bc=new BasicCalculater();

public double velocity(double x1, double x2,double t1, double t2){
    double changeX;
    double changeT;
    changeT=t1-t2;
    changeX=x1-x2;
    return changeX/changeT;
}


public double acceleration(double v1,double v2, double t1, double t2){
    double changeV;
    double changeT;
    changeT=t1-t2;
    changeV=v1-v2;
    return changeV/changeT;
}


public double force(double m1, double m2){
    double G=6.672*bc.exponents(10,-8);
    double r2=15673681;

    return (G*m1*m2)/r2;
}


public double speed(double velocity, double time1, double time2, double acceleration){

    return velocity;
}


public double work(double force, double speed, double theta){

    return force;
}


}

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

public double work(double force,  double distance){

    return force*distance;
}

public double ef(double ei, double work){
    return ei+work;
}

public double KE(double mass, double velocity){
    return .5*mass*velocity;
}

public double PEG(double mass,double height){
    double g=6.67*bc.exponents(10,-11);
    return mass*g*height;
}

public double pf(double Pi, double inpulse){
    return Pi+inpulse;
}

public double P(double mass, double Veloccity){
    return mass*Veloccity;
}

public double impulse(double force, double time){
    return force*time;
}

public double power(double work, double time){
    return work/time;
}


}

package models;

public class Physics extends MyMath {
    BasicCalculater bc=new BasicCalculater();

    /**
     * this is the velocity of an object
     * @param x1 the first distance
     * @param x2 second distance
     * @param t1 first time
     * @param t2 second time
     * @return the velocity of the item
     */
    public double velocity(double x1, double x2,double t1, double t2){
    double changeX;
    double changeT;
    changeT=t1-t2;
    changeX=x1-x2;
    return changeX/changeT;
}

    /**
     * Will solve for the acceleration of the object
     * @param v1 the velocity of the object
     * @param v2 the second velocity of the oblject
     * @param t1 the first time
     * @param t2 second time
     * @return the acceleration of the object
     */
    public double acceleration(double v1,double v2, double t1, double t2){
    double changeV;
    double changeT;
    changeT=t1-t2;
    changeV=v1-v2;
    return changeV/changeT;
}

    /**
     * will solve for the force of the object
     * @param m1 the first mass
     * @param m2 and the mass 2
     * @return will return teh force appied
     */
    public double force(double m1, double m2){
    double G=6.672*bc.exponents(10,-8);
    double r2=15673681;

    return (G*m1*m2)/r2;
}

    /**
     * will solve for the work
     * @param force the force of the object
     * @param distance the distance the object has gone
     * @return the value of work
     */
    public double work(double force,  double distance){

    return force*distance;
}

    /**
     * will solve for energy final
     * @param ei energy initial
     * @param work the work
     * @return the energy final
     */
    public double ef(double ei, double work){
    return ei+work;
}

    /**
     * will solve kenetic energy
     * @param mass mass of the object
     * @param velocity velocity of the object
     * @return the value of Kenetic energy
     */
    public double KE(double mass, double velocity){
    return .5*mass*velocity;
}

    /**
     * will solve for the potential energy due to gravity
     * @param mass the mass of the object
     * @param height how heigh the object is from the ground
     * @return the value of lthe potential energy
     */
    public double PEG(double mass,double height){
    double g=6.67*bc.exponents(10,-11);
    return mass*g*height;
}

    /**
     * will solve for the pf of the object
     * @param Pi p initial
     * @param inpulse the impulse
     * @return the value of f
     */
    public double pf(double Pi, double inpulse){
    return Pi+inpulse;
}

    /**
     * will solve for p
     * @param mass mass of the object
     * @param Veloccity velocity of the object
     * @return the value of p
     */
    public double P(double mass, double Veloccity){
    return mass*Veloccity;
}

    /**
     * will solve for impulse
     * @param force teh force of the object
     * @param time the time of the object
     * @return the value for impulse
     */
    public double impulse(double force, double time){
    return force*time;
}

    /**
     * will solve for the power
     * @param work the work of te object
     * @param time the time it is worked
     * @return the value of power
     */
    public double power(double work, double time){
    return work/time;
}


}

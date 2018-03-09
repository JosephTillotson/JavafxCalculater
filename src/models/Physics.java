package models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Physics extends MyMath {
    BasicCalculater bc=new BasicCalculater();

    /**
     * this is the velocity of an object
     * @param x1 the first distance
     * @param x2 second distance
     *           @param t the time interval of the displacement
     * @return the velocity of the item
     */
    public double velocity(double x1, double x2,double t){
    double changeX;
    changeX=x2 -x1;
    double answer=changeX/t;
    save("(+"+x2+"-"+x1+")"+"/"+t+"="+answer);
    return answer;
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
    changeT=t2 - t1;
    changeV=v2 - v1;
    double answer= changeV/changeT;
    save("("+t2+"-"+t1+")"+" / ("+v2+"-"+v1+") = "+changeV+" / " +changeT+" = "+answer);
    return answer;
}

    /**
     * will solve for the force of the object
     * @param m1 the first mass
     * @param m2 and the mass 2
     *           @param  r the distance between the 2 objects
     * @return will return teh force appied
     */
    public double force(double m1, double m2,double r){
    double G=6.672*bc.exponents(10,-11);
    double r2= r * r;
    double answer=(G*m1*m2)/r2;
save("( "+m1+"*"+m2+"*"+G+") / "+r+"^2 = "+m1*m2*G+" / "+r2+" = "+answer);
    return answer;
}

    /**
     * will solve for the work
     * @param force the force of the object
     * @param distance the distance the object has gone
     * @return the value of work
     */
    public double work(double force,  double distance){
        double answer=force*distance;
        save(force+"*"+distance+" = "+answer);

    return answer;
}

    /**
     * will solve for energy final
     * @param ei energy initial
     * @param work the work
     * @return the energy final
     */
    public double ef(double ei, double work){
        double answer=ei+work;
        save(ei+"+"+work+" = "+answer);
    return answer;
}

    /**
     * will solve kenetic energy
     * @param mass mass of the object
     * @param velocity velocity of the object
     * @return the value of Kenetic energy
     */
    public double KE(double mass, double velocity){
        double answer=.5*mass*velocity;
        save(.5+"*"+mass+"*"+velocity+" = "+answer);
    return answer;
}

    /**
     * will solve for the potential energy due to gravity
     * @param mass the mass of the object
     * @param height how heigh the object is from the ground
     * @return the value of lthe potential energy
     */
    public double PEG(double mass,double height){
        double g=6.67*bc.exponents(10,-11);
        double answer=mass*g*height;
    save(mass+"*"+g+"*"+height+" = "+answer);
    return answer;
}

    /**
     * will solve for the pf of the object
     * @param Pi p initial
     * @param inpulse the impulse
     * @return the value of f
     */
    public double pf(double Pi, double inpulse){
        double answer=Pi+inpulse;
        save(Pi+"+"+inpulse+" = "+answer);
    return answer;
}

    /**
     * will solve for p
     * @param mass mass of the object
     * @param Veloccity velocity of the object
     * @return the value of p
     */
    public double P(double mass, double Veloccity){
        double answer = mass * Veloccity;
        save(mass+"*"+Veloccity+" = "+answer);
    return answer;
}

    /**
     * will solve for impulse
     * @param force teh force of the object
     * @param time the time of the object
     * @return the value for impulse
     */
    public double impulse(double force, double time){
        double answer = force*time;
        save(force+"*"+time+" = "+answer);
    return answer;
}

    /**
     * will solve for the power
     * @param work the work of te object
     * @param time the time it is worked
     * @return the value of power
     */
    public double power(double work, double time){
        double answer=work/time;
        save(work+"/"+time+" = "+answer);
    return answer;
}

    private void save(String answer) {
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(answer);
        } catch (FileNotFoundException e) {
            //
        }
    }


}

package models;

public class BasicCalculater extends MyMath {

    public BasicCalculater(){}

    public BasicCalculater(double x, double y){
        super(x,y);
    }

    public double add(){
        return super.getX()+super.getY();
    }

    public double add(double x, double y){
        return x+y;
    }

    public double multiply(){
        return super.getX()*super.getY();
    }

    public double multiply(double x, double y){
        return x*y;
    }

    public double devide(){
        return super.getX()/super.getY();
    }

    public double devide(double x, double y){
        return x/y;
    }

    public double subtract(){
        return super.getX()-super.getY();
    }

    public double subtract(double x, double y){
        return x-y;
    }

    public double exponents(){
        return Math.pow(super.getX(),super.getY());
    }

    public double exponents(double x, double y){
        return Math.pow(x,y);
    }
}

package models;

public class BasicCalculater extends MyMath {

    BasicCalculater(double x, double y){
        super(x,y);
    }

    public double add(){
        return super.getX()+super.getY();
    }

    private double multiply(){
        return super.getX()*super.getY();
    }

    public double devide(){
        return super.getX()/super.getY();
    }

    public double subtract(){
        return super.getX()-super.getY();
    }

    public double exponents(){
        return Math.pow(super.getX(),super.getY());
    }
}

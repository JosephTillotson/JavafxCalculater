package models;

 public class MyMath {

    private double x;

    private double y;

    private double a;

    private double b;

    private double c;

    public MyMath(){}

    public MyMath(double x){
        this.setX(x);
    }

    public MyMath(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public MyMath(double a, double b, double c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }


     public double getX() {
         return x;
     }

     public void setX(double x) {
         this.x = x;
     }

     public double getY() {
         return y;
     }

     public void setY(double y) {
         this.y = y;
     }

     public double getA() {
         return a;
     }

     public void setA(double a) {
         this.a = a;
     }

     public double getB() {
         return b;
     }

     public void setB(double b) {
         this.b = b;
     }

     public double getC() {
         return c;
     }

     public void setC(double c) {
         this.c = c;
     }
 }

package models;

 public class MyMath {

    private double x;

    private double y;

    private double a;

    private double b;

    private double c;

     /**
      * basic constructer for mymath
      */
    public MyMath(){}

     /**
      * an overloaded one that will set the x value
      * @param x the value to be saved
      */
    public MyMath(double x){
        this.setX(x);
    }

     /**
      * the overloaded constructor
      * @param x the x value
      * @param y the y value
      */
    public MyMath(double x, double y){
        this.setX(x);
        this.setY(y);
    }

     /**
      * overloaded constructer
      * @param a the value of a
      * @param b the value of b
      * @param c the value of c
      */
    public MyMath(double a, double b, double c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

     /**
      * will get the value of x
      * @return the value of x
      * */
     public double getX() {
         return x;
     }

     /**
      * will set the value of x
      * @param x teh value to be
      */
     public void setX(double x) {
         this.x = x;
     }

     /**
      * will get the value of y
      * @return the value to be
      */
     public double getY() {
         return y;
     }

     /**
      * return the value of y
      * @param y the value to be
      */
     public void setY(double y) {
         this.y = y;
     }

     /**
      * will get the value of A
      * @return will return the value of A
      */
     public double getA() {
         return a;
     }

     /**
      * will set the value of A
      * @param a the value to be
      */
     public void setA(double a) {
         this.a = a;
     }

     /**
      * will get the value of b
      * @return the value of b
      */
     public double getB() {
         return b;
     }

     /**
      * will set the value of B
      * @param b the value to be
      */
     public void setB(double b) {
         this.b = b;
     }

     /**
      * will get the value of c
      * @return the value to be
      */
     public double getC() {
         return c;
     }

     /**
      * will set the value of C
      * @param c the value to be
      */
     public void setC(double c) {
         this.c = c;
     }
 }

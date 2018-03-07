package models;

public class BasicCalculater extends MyMath {
    /**
     * THis is the main construscter on the calculater
     */
    public BasicCalculater(){}


    /**
     * THis will add two different numbers
      * @param x the first number
     * @param y the second number
     * @return will return the answer of the two
     */

    public double add(double x, double y){
        return x+y;
    }


    /**
     * Will multiply two different numbers
     * @param x This will be the first number
     * @param y this will be the second number
     * @return will return the product
     */

    public double multiply(double x, double y){
        return x*y;
    }


    /**
     * This will divide two numbers
     * @param x THe top number
     * @param y the second number or the one on the bottom
     * @return Will return the answer
     */
    public double devide(double x, double y){
        return x/y;
    }

    /**
     * Will subtract two numbers
     * @param x the first number
     * @param y the second number
     * @return Will return the answer
     */

    public double subtract(double x, double y){
        return x-y;
    }

    /**
     * Will take care of exponents
     * @param x the first number
     * @param y the power
     * @return will return the answer
     */
    public double exponents(double x, double y){
        return Math.pow(x,y);
    }
}

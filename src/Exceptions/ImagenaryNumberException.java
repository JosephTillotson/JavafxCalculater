package Exceptions;

public class ImagenaryNumberException extends IllegalArgumentException{

    public ImagenaryNumberException(){

    }
//taco
    public ImagenaryNumberException(String s){
        super(s);
    }

    public ImagenaryNumberException(Throwable cause){
        super(cause);
    }

    public ImagenaryNumberException(String message, Throwable cause){
        super(message, cause);
    }


}

package models;

public class Calc {

    private String whole(String number){
        String answer="";
        if (number.contains("x")) {
            for (int i = 0; i < number.length(); i++){
                char letter=number.charAt(i);
                if (Character.isDigit(letter)){
                    answer=answer+letter;
                }
            }
            return answer;
        }else
            return "0";


    }

    private String exponents(String power){
//        String[] splited=power.split("^");
//        for(int i= 0; i <splited.length;i++){
//            System.out.println(splited[i]);
//        }
//         String ex = "";
//        for (int i = 0; i < splited.length;i++){
//            char x=splited[1].charAt(i);
//            if (Character.isDigit(x)){
//                ex=ex+x;
//            }
//            System.out.println(ex);
//        }
        return power;
    }

//    private String trigproperties(String trig){
//
//    }
//
//    private String product(String product){
//
//    }

//    private String quotientRule(String quotient){
//
//    }

    /**
     * This will dirive a calc equasion
     * @param dirive String that will be dirived
     * @return will return a dirived string
     */
    public String drive(String dirive){
        String[] parts= dirive.split("[-+]");
        for(int i= 0; i<parts.length; i++){

            if (parts[i].contains("^")){
                exponents(parts[i]);
            }else{
                parts[i]=whole(parts[i]);
            }
            System.out.println(parts[i]);
        }
        return dirive;
    }
}

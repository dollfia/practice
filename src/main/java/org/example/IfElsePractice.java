package org.example;

public class IfElsePractice {
    public static void main(String[] args){

        boolean isLightOn = false;

        // example for if
        if(isLightOn){
            System.out.println( "If Condition Executed" );
        }

        //example for if...else
//        boolean isNight = true;
//        if (isNight){
//            System.out.println( "it is night" );
//        }else{
//            System.out.println( "it is not night" );
//        }

        //example for elif
//        int num = 3;
//        if(num>20){
//            System.out.println( "num is greater than 20" );
//        } else if (num>5) {
//            System.out.println( "num is greater than 5" );
//
//        }else{
//            System.out.println( "num is less than 5" );
//        }

        //example for nested if
        String nes = "checke";
        int number = 10;
        if (nes.equals("check")){
            System.out.println( "1st if : nes is check" );
            if (number == 10){
                System.out.println( "2nd if : number is 10" );
            }
        }

    }
}

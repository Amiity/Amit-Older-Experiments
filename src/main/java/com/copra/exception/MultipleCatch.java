package com.copra.exception;

public class MultipleCatch {

    public static void main(String [] args){

        try{
            int a =2;
            int v =0;

            a = a/v;
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException occured");
        }catch (Exception e){
            System.out.println("Exception occured");
        }



    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;

/**
 *
 * @author RYZEN
 */
public class CalculatorController {
    
    public static Response add(String number1,String number2){
        try{
            double num1Int,num2Int;
            
            if (number1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            
            if (number2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            
            try{
                num1Int=Double.parseDouble(number1);
            }catch(NumberFormatException ex){
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            
            try{
                num2Int=Double.parseDouble(number2);
            }catch(NumberFormatException ex){
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            
            if(number1.length()<2){
                
            }
            
            
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    public static Response subtract(){
        try{
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    public static Response multiply(){
        try{
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    public static Response divide(){
        try{
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    public static Response potency(){
        try{
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}

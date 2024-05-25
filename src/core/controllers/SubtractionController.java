/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Calculator;
import core.models.History;
import core.models.OperationRegister;
import core.models.operations.Subtraction;

/**
 *
 * @author jregalado
 */
public class SubtractionController {
    public static int decimalsCount(double num) {
        String number = String.valueOf(num);
        int index = number.indexOf('.');
        if (index == -1) {
            return 0;
        }
        String decimals = number.substring(index + 1);
        
        if (decimals.equals("0")) {
            return 0;
        }
        
        return decimals.length();
    }
    
    public static Response subtract(String number1,String number2){
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
            
            if(decimalsCount(num1Int)>3){
                return new Response("Number 1 must have 3 decimal places or less", Status.BAD_REQUEST);
            }
            
            if(decimalsCount(num2Int)>3){
                return new Response("Number 2 must have 3 decimal places or less", Status.BAD_REQUEST);
            }
            
            double result=new Calculator().operate(new Subtraction(), num1Int, num2Int);
            
            if(decimalsCount(result)>3){
                return new Response("Result must have 3 decimal places or less", Status.BAD_REQUEST);
            }
            
            History.getInstance().addOperation(new OperationRegister(num1Int, num2Int, "-", result));
            
            return new Response("Operation done successfully", Status.OK, result);
            
            
            
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}

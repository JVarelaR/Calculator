/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import core.models.operations.Operation;

/**
 *
 * @author edangulo
 */
public class Calculator {

    public Calculator() {
    }
    
    
    
    public double operate(Operation operation,double number1, double number2){
        return operation.operate(number1, number2);
    }
    
}

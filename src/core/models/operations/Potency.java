/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.operations;

/**
 *
 * @author jregalado
 */
public class Potency implements Operation{

    public Potency() {
    }
    
    
    @Override
    public double operate(double num1,double num2) {
        return Math.pow(num1,num2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.operations;

/**
 *
 * @author jregalado
 */
public class Addition implements Operation{

    @Override
    public double operate(double num1,double num2) {
        return num1 + num2;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.OperationRegister;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jregalado
 */
public class HistoryController {
    public static Response getOperations(History history){
        try{
            ArrayList<OperationRegister> operations = new ArrayList<>();
            
            if(history.getOperations().isEmpty()){
                return new Response("History is empty", Status.NO_CONTENT);
            }
            
            for (int i = history.getOperations().size() - 1; i >= 0; i--){
                operations.add(history.getOperations().get(i));
            }
            
            return new Response("", Status.OK, operations);
        }catch(Exception ex){
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.pd_app.util;

/**
 *
 * @author Božena
 */
public class PDException extends Exception{
    private String poruka;

    public PDException(String poruka) {
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
    
}

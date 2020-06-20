/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.pd_app;

import hr.pd_app.model.Zaposlenik;
import hr.pd_app.util.HibernateUtil;

/**
 *
 * @author Bozena
 */
public class Start {
    public Start() {
        HibernateUtil.getSessionFactory().openSession();

        //Zaposlenik z= new Zaposlenik();
        //z.setIme("Pero");
    }

    public static void main(String[] args) {
        new Start();
    }
}

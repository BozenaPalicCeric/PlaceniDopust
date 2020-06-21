/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.pd_app.controller;

import hr.pd_app.model.PlaceniDopust;
import hr.pd_app.util.PDException;
import java.util.List;

/**
 *
 * @author Bozena
 */
public class ObradaPlaceniDopust extends Obrada<PlaceniDopust>{

    public ObradaPlaceniDopust() {
    }

    public ObradaPlaceniDopust(PlaceniDopust entitet) {
        super(entitet);
    }

    @Override
    protected void kontrolaCreate() throws PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaUpdate() throws PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlaceniDopust> getPodaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void nakonSpremanja() throws PDException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

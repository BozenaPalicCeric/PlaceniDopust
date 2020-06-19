/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.pd_app.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bozena
 */
@Entity
public class PlaceniDopust extends Entitet{
    
    private String vrstaPlaceniDopust;
    private Date pocetakPD;
    private Date krajPD;
    private Integer koristenBrojDanaPD;
    private Integer godina;
    private Boolean odobrenjeNadredeni;

    @ManyToOne
    private Zaposlenik zaposlenik;

    public String getVrstaPlaceniDopust() {
        return vrstaPlaceniDopust;
    }

    public void setVrstaPlaceniDopust(String vrstaPlaceniDopust) {
        this.vrstaPlaceniDopust = vrstaPlaceniDopust;
    }

    public Date getPocetakPD() {
        return pocetakPD;
    }

    public void setPocetakPD(Date pocetakPD) {
        this.pocetakPD = pocetakPD;
    }

    public Date getKrajPD() {
        return krajPD;
    }

    public void setKrajPD(Date krajPD) {
        this.krajPD = krajPD;
    }

    public Integer getKoristenBrojDanaPD() {
        return koristenBrojDanaPD;
    }

    public void setKoristenBrojDanaPD(Integer koristenBrojDanaPD) {
        this.koristenBrojDanaPD = koristenBrojDanaPD;
    }

    public Integer getGodina() {
        return godina;
    }

    public void setGodina(Integer godina) {
        this.godina = godina;
    }

    public Boolean getOdobrenjeNadredeni() {
        return odobrenjeNadredeni;
    }

    public void setOdobrenjeNadredeni(Boolean odobrenjeNadredeni) {
        this.odobrenjeNadredeni = odobrenjeNadredeni;
    }

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }
    @Override
    public String toString(){
        return getZaposlenik().getSifra()+"." + getZaposlenik().getIme() + " " + getZaposlenik().getPrezime();
    }
            
    
}


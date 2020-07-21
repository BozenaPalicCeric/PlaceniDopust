/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.pd_app.util;

import hr.pd_app.controller.ObradaZaposlenik;
import hr.pd_app.model.Zaposlenik;
import java.util.Calendar;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Bozena
 */
public class Pomocno {
    public static boolean isOibValjan(String oib) {

        if (oib == null) {
            return false;
        }

        if (oib.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10) {
            kontrolni = 0;
        }

        return kontrolni == Integer.parseInt(oib.substring(10));
    }
    public static void pocetniInsert() {

        Zaposlenik zaposlenik = new Zaposlenik();
        zaposlenik.setEmail("bozena.palic@gmail.com");
        zaposlenik.setIme("Božena");
        zaposlenik.setPrezime("Palić Cerić");
        zaposlenik.setOib("18298417901");
        zaposlenik.setLozinka(BCrypt.hashpw("b", BCrypt.gensalt()));
        zaposlenik.setBrojDanaGoPremaUgovoruORadu(20);
        Calendar cb = Calendar.getInstance();
        cb.set(Calendar.YEAR, 2019);
        cb.set(Calendar.MONTH, 0);
        cb.set(Calendar.DAY_OF_MONTH, 1);
        zaposlenik.setDatumZaposlenja(cb.getTime());
        zaposlenik.setNadredeni(zaposlenik);

        ObradaZaposlenik obradaZaposlenik = new ObradaZaposlenik(zaposlenik);
        try {
            zaposlenik = obradaZaposlenik.create();
        } catch (PDException ex) {
            System.out.println(ex.getPoruka());
        }
    }
}

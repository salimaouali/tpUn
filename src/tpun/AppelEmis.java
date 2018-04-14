
package tpun;

import java.util.Date;


public class AppelEmis extends Appel {
    
    public AppelEmis(int num_apl, Date date, int duree, Contact contact) {
        super(num_apl, date, duree, contact);
    }
    
    

    @Override
    public int calculer_cout() {
        return getDuree()*2;
       
    }
}

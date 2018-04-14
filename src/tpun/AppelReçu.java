
package tpun;

import java.util.Date;


    public  class AppelReçu extends Appel{
    
    public AppelReçu(int num_apl, Date date, int duree, Contact contact) {
        super(num_apl, date, duree, contact);
    }

    
    
    @Override
    public int  calculer_cout(){
    return 0;
    }
}

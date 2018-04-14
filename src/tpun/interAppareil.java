
package tpun;

import java.util.ArrayList;
import java.util.Date;


public interface interAppareil {
    
    public void enregister(Appel appel);
    public void enregister(Contact contact);
    public Contact consulter_cont_par_num(String num_tel);
    public ArrayList<Contact> consulter_par_mot_cle (String mot_cle);
   public double cout_total();
        public double cout_appel(Date dateDebut, Date dateFin);
    public double cout_appel(Contact contact);

    
       
}


package tpun;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javafx.scene.control.ListCell;


public class TpUn {
    
    

  
    public static void main(String[] args) {
        
        
        Appareil appareil=new Appareil();
        
        
        
       
        
        
        Contact cont1 = new Contact(appareil.getCptContact(), "salim", "0666983962");
        appareil.inrCptContact();
        Contact cont2 = new Contact(appareil.getCptContact(), "kenza", "556777");
        appareil.inrCptContact();
        Contact cont3 = new Contact(appareil.getCptContact(), "zaki", "653556777");
        appareil.inrCptContact();
        
        appareil.enregister(cont1);
        appareil.enregister(cont2);
        appareil.enregister(cont3);

        appareil.enregister(cont1);
        appareil.enregister(cont2);
        appareil.enregister(cont3);
        
        
        Appel apl1 = new AppelEmis(appareil.getCptAppel(), new Date(), 1, cont1);
        appareil.inrCptAppel();
        
        Appel apl2 = new AppelEmis(appareil.getCptAppel(), new Date(), 12, cont2);
        appareil.inrCptAppel();
        
        Appel apl5 = new AppelEmis(appareil.getCptAppel(), new Date(), 12, cont3);
        appareil.inrCptAppel();
        
        Appel apl3 = new AppelEmis(appareil.getCptAppel(), new Date(), 17, cont3);
        appareil.inrCptAppel();
       
        Appel apl4 = new AppelReçu(appareil.getCptAppel(), new Date(), 23, cont3); 
        appareil.inrCptAppel();
        
    
        appareil.enregister(apl4);
        appareil.enregister(apl3);
        appareil.enregister(apl2);
        appareil.enregister(apl1);
        
        System.out.println("le contact avec numéro de tel :"+" "+appareil.consulter_cont_par_num("0666983962"));
         System.out.println("le contact avec un mot clé :"+" "+appareil.consulter_par_mot_cle("za"));
         System.out.println("le cout total des appels est :"+" "+appareil.cout_total()+" " +"centimes");
       System.out.println("le cout total concernant un contact :"+" "+appareil.cout_appel(cont3)+" " +"centimes");
       
         
            
        
        
    
    }

    
    
    
}


package tpun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Appareil implements interAppareil{
    
    private ArrayList<Appel> ListAppel;
    private ArrayList<Contact> ListContact;
    private int cptContact=1;
    private int cptAppel=1;

    public int getCptContact() {
        return cptContact;
    }

    public void setCptContact(int cptContact) {
        this.cptContact = cptContact;
    }

    public int getCptAppel() {
        return cptAppel;
    }

    public void setCptAppel(int cptAppel) {
        this.cptAppel = cptAppel;
    }
    
    public ArrayList<Appel> getListAppel() {
        return ListAppel;
    }

    public void setListAppel(ArrayList<Appel> ListAppel) {
        this.ListAppel = ListAppel;
    }

    public ArrayList<Contact> getListContact() {
        return ListContact;
    }

    public void setListContact(ArrayList<Contact> ListContact) {
        this.ListContact = ListContact;
    }

  public Appareil() {
      super();
        this.ListAppel = new ArrayList();
        this.ListContact = new ArrayList();
    }
 
    @Override
    public void enregister(Appel appel) {
        
        this.ListAppel.add(appel);
        
    }

    @Override
    public void enregister(Contact contact) {
        
        this.ListContact.add(contact);
        
    }

    @Override
    public Contact consulter_cont_par_num(String num_tel) 
    {
        for(Contact contact : this.ListContact)
        {
        if (contact.getNum_tel().equals(num_tel)) return contact;
        }
        return null;
        
    }
     
    

    @Override
    public ArrayList<Contact> consulter_par_mot_cle(String mot_cle) 
    {
        ArrayList<Contact> listResultat = new ArrayList();
       
        for(Contact contact : this.ListContact)
        {
            if(contact.getNom().contains(mot_cle))  listResultat.add(contact);    
        }
        return listResultat;
    }

  

    
    private ArrayList<Appel> ArrayList() 
    {
    return  ListAppel;   
    }
      @Override
    public double cout_total() {
       int total=0;
       for(Appel appel : this.ListAppel) 
       {
           total=total+appel.calculer_cout();
       }
       return total;
    }

    @Override
    public double cout_appel(Date dateDebut, Date dateFin) 
    {
    int total=0;
    for(Appel appel : this.ListAppel)
        {
            if((appel.getDate().compareTo(dateDebut)==1) && (appel.getDate().compareTo(dateFin)== -1)) 
                total=total+appel.calculer_cout();
            
        }
    return total;
    
    }

    @Override
    public double cout_appel(Contact contact)
    {
        int total1=0;
        
        for(Appel appel : this.ListAppel)
        {
        if(appel.getContact().getNom()==contact.getNom()) total1=total1+appel.calculer_cout();
        }
    return total1;
    }

    
    public void inrCptContact(){
    this.cptContact++;
    }
    
    
    public void inrCptAppel(){
    this.cptAppel++;
    }
    
    
    
    
}

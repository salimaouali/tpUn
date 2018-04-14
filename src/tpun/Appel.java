
package tpun;

import java.util.Date;


public abstract class Appel {
    
    private int num_apl;
    private Date date;
    private int duree;
    private Contact contact;
    

    public Appel(int num_apl, Date date, int duree, Contact contact) {
        this.num_apl = num_apl;
        this.date = date;
        this.duree = duree;
        this.contact = contact;
    }

    public int getNum_apl() {
        return num_apl;
    }

    public void setNum_apl(int num_apl) {
        this.num_apl = num_apl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public abstract int calculer_cout();
    
    
    
    @Override
     public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(num_apl ); 
        s.append(date);
        s.append(duree);
        s.append(contact);

        return s.toString();
    }
}

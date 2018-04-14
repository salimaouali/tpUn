
package tpun;


public class Contact {
    
    private int id;
    private String nom;
    private String num_tel;
    
    
    public Contact (int id, String nom , String num_tel){
    
    this.id=id;
    this.nom=nom;
    this.num_tel=num_tel;
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }
    
     
        public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(id+" " ); 
        s.append(nom+" ");
        s.append(num_tel+" ");
        

        return s.toString();
    }
}
    
    


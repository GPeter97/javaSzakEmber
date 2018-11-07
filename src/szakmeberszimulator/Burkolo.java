
package szakmeberszimulator;

 
public class Burkolo extends MesterEmber {

    public enum Helyszin{
    Belso,
    Kulso
    }
    
   private Helyszin szakTerulet;
   
    
    public Burkolo(String nev, int napiDij, Helyszin szaTerulet ) {
        super(nev, napiDij);
        this.szakTerulet = szakTerulet;
    }

    @Override
    public boolean munkatVallal(int nap) {
        if (!this.foglaltNapok[nap-1]) {
            this.foglaltNapok[nap-1]=true;
            return true;
        }
        /*System.out.println("Ma kocsmázom nem dolgozok");*/
       return false;
    }
    
    public int osszesSzabadNap(){
        int db=0;
        for (int i = 0; i < super.foglaltNapok.length; i++) {
            if (this.foglaltNapok[i]==false){
            db++;
            }
        }
        return db;
    }
    @Override
    public String toString(){
        String s = super.toString();
        String[] sorok = s.split("]");
        
        if (this.szakTerulet == Helyszin.Belso) {
          sorok[0]+= "- Belső Helyszin"; 
        }else if (this.szakTerulet == Helyszin.Kulso) {
            sorok[0]+= "- Külső Helyszin";
        }
        
        return sorok[0]+sorok[1];
        
    }
}

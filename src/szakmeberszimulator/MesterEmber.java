/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakmeberszimulator;


public abstract class MesterEmber {
    
    protected String nev;
    protected int napiDij;
    protected boolean[] foglaltNapok;
    
    
    public MesterEmber(String nev, int napiDij){
        
    this.nev=nev;
    this.napiDij=napiDij;
    foglaltNapok = new boolean[31];
        for (int i = 0; i < foglaltNapok.length; i++) {
            foglaltNapok[i]=false;
        }
        
    }

    @Override
    public String toString() {
        String s = String.format("[%s - %d Ft]",this.nev, this.napiDij);
        
        for (int i = 0; i < foglaltNapok.length; i++) {
            s += String.format("%-2d",(i+1));
        }
        s +="\n";
        for (int i = 0; i < foglaltNapok.length; i++) {
            s += String.format("%-2s", foglaltNapok[i] ?"SZ":"F");
        }
        
         return s;  
    }
    
    public abstract boolean munkatVallal(int nap);

    
}


package suhajdabea;


public class SuhajdaBea {

   
    public class Alkatresz {
        
        private String[] kepNevek;
        private int ar;
        private String leiras;

        public Alkatresz(String leiras, int ar) {
            this.ar = ar;
            this.leiras = leiras;
        }

        public Alkatresz(String leiras, int ar, String egykepNeve) {
            this.egykepNeve = egykepNeve;
            this.ar = ar;
            this.leiras = leiras;
        }

        public Alkatresz(String leiras, int ar, String[] kepNevek) {
            this.kepNevek =new String[0];
            this.ar = ar;
            this.leiras = leiras;
        }
        
        

        public int getAr() {
            return ar;
        }

        public String getLeiras() {
            return leiras;
        }
        
        public void mutat(boolean csakElsot){
            System.out.println("csakElsot = " + csakElsot);
        }
        
        public void felvesz(String kepNeve){
            System.out.println("");
        }
        
        public boolean egyforma(Alkatresz masik){
            return false;
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}

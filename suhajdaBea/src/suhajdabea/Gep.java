
package suhajdabea;


public class Gep {
    public static void main(String[] args) {
        
      new Gep().feladat();
    }
      
        
        

   

    

    private void feladat() {
        Jotanacs jotanacs1 = new Jotanacs("Nincsen rózsa tövis nelkül.");
        //System.out.println("Napi jotancs: " + jotanacs1.kiir());
        jotanacs1.Kiir();
        
        Jotanacs jotanacs2 = new Jotanacs("Minden utazas egy lépéssel kezdődik");
        //System.out.println("Napi jotancs: " + jotanacs2.kkir());
        jotanacs2.Kiir();
        
        Jotanacs jotanacs3 = new Jotanacs("Inkább utáljanak oylanért, mint szeressenek azért, amiylen nem vagyok.");
        //System.out.println("Napi jotancs: " + jotanacs3.kiir());
        jotanacs3.Kiir();
        
        
    }
    
        
        
        
         
    
}

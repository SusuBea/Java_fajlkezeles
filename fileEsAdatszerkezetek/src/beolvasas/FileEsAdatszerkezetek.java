
package beolvasas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;


public class FileEsAdatszerkezetek {

    private List<String> sorok;
   
    public static void main(String[] args) throws IOException, ParseException {
       new FileEsAdatszerkezetek().feladatok();
        
    }

    public FileEsAdatszerkezetek() throws IOException {
        sorok = Files.readAllLines(Path.of("fuvar.csv"));
    }

        
    
    private void feladatok() throws IOException, ParseException {
        //feladat1();
        //feladat2();
        feladat3();
    }
    
    private void feladat1() throws IOException {
       //sorok = Files.readAllLines(Path.of("fuvar.csv"));
        
        
        System.out.println("1. feladat: a file sorainak a száma: ");
        int i = sorok.size();
        System.out.printf("A fájl %d sort tartalmaz.\n", sorok.size());
    }

    private void feladat2() throws ParseException {
        System.out.println("2. feladat: 1 fuvar adatai ");
        //"5240;2016-12-15 23:45:00;900;2,5;10,75;2,45;bankkártya"
        String sor = "5240;2016-12-15 23:45:00;900;2,5;10,75;2,45;bankkártya";
         Fuvar fuvar = new Fuvar(sor);
         System.out.println(fuvar);
         
         
    }

    private void feladat3() throws ParseException {
        System.out.println("---- 3. feladat: 1 véletlen fuvar adatai:");
        int sorszam = (int)(Math.random()*sorok.size());
        //sorszam nem lehet 0;
        sorszam = sorszam == 0 ? ++sorszam : sorszam;
        String sor = sorok.get(sorszam);
        Fuvar fuvar = new Fuvar(sor);
        System.out.println(fuvar);
        
        
    }
    
   
   
    
}

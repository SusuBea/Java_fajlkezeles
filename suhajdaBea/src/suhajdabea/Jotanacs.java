package suhajdabea;

import java.util.Random;

class Jotanacs {

    Random rnd = new Random();

    private String jotancsok;
    private int het;

    public Jotanacs() {
        this.jotancsok = jotancsok;
        this.het = het;
       
    }

    public Jotanacs(String jotancsok) {
        this.jotancsok = jotancsok;
        this.het = het;
    }

    public Jotanacs(int het) {
        this.het = het;
        this.jotancsok = jotancsok;

    }

    public Jotanacs(String jotancsok, int het) {
        this.jotancsok = jotancsok;
        this.het = het;
    }

    public String getJotancsok() {
        return jotancsok;
    }

    public void setJotancsok(String jotancsok) {
        this.jotancsok = jotancsok;
    }

    public void Kiir() {
        //System.out.println("Konzolra ír.");
        System.out.println("Üzleti válallkozás szempontjából sikeres");
        het = rnd.nextInt(0, 52);
        this.het = het;
        System.out.println("hét " + this.het);

        //String jotanacsok = "Nincsen rózsa tövis nelkül."
        //this.jotancsok = jotanacsok;
    }

}

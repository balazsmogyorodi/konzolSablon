
package modell;


public class Rendezheto_utod implements Comparable<Rendezheto_utod>{
    private int kor;
    private String nev;

    public Rendezheto_utod(int kor, String nev) {
        this.kor = kor;
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Rendezheto_utod{" + "kor=" + kor + ", nev=" + nev + '}';
    }

    @Override
    public int compareTo(Rendezheto_utod o) {
       return this.kor - o.kor;
      }

    public String getNev() {
        return nev;
    }
    
    
    
}

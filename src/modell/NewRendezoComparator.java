
package modell;

import java.text.Collator;
import java.util.Comparator;


public class NewRendezoComparator implements Comparator<Rendezheto_utod>{

    @Override
    public int compare(Rendezheto_utod o1, Rendezheto_utod o2) {
        Collator coolator = Collator.getInstance();
        return coolator.compare(o1.getNev(), o2.getNev());
         }
    
}

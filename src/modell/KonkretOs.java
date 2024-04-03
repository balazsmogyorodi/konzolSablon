package modell;

import java.util.Objects;
import java.util.UUID;

public class KonkretOs extends Abstract{
    private UUID id;
    private boolean van;
    private String info;

    

    public KonkretOs() {
        this(true);
    }

    public KonkretOs(boolean van)  {
      this(van, "valami");
    }

    public KonkretOs(boolean van, String info) throws SajatException{
        setId();
        this.van = van;
        if(info.length() < 3){
        throw  new SajatException("info.length < 3");
    }
        this.info = info;
    }
    
    
    

    public UUID getId() {
        return id;
    }

    /* beszédesebb név: ujIdGeneralas() */
    public void setId() {
        this.id = UUID.randomUUID();
    }

    public boolean isVan() {
        return van;
    }

    public void setVan(boolean van) {
        this.van = van;
    }

    public String mitTud(){
        return "Konkrét ős vagyok";
    }
    
    @Override
    public String toString() {
        return "KonkretOs{" + "id=" + id + ", van=" + van + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KonkretOs other = (KonkretOs) obj;
        return Objects.equals(this.id, other.id);
    }
    
    /**
     *
     */
    @Override
        public abstract void abstractMetodus(){
    
    
    
        }
    
    
}

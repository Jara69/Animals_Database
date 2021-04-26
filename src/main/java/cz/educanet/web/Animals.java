package cz.educanet.web;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Animals implements Serializable {
    private String id, jmeno, druh, vaha, narozen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getVaha() {
        return vaha;
    }

    public void setVaha(String vaha) {
        this.vaha = vaha;
    }

    public String getNarozen() {
        return narozen;
    }

    public void setNarozen(String narozen) {
        this.narozen = narozen;
    }
}

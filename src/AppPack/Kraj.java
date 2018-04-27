
package AppPack;

import org.springframework.stereotype.Component;

@Component
public class Kraj {
    private String nazwa;
    private String curr;
    private double taxPercent;
    private double taxValue;
    
    public Kraj(String nazwa, String curr, double taxPercent, double taxValue) {
        this.nazwa = nazwa;
        this.curr = curr;
        this.taxPercent = taxPercent;
        this.taxValue = taxValue;
    }
    
    public Kraj()
    {
        
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }  
    
}

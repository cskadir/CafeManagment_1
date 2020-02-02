
import java.util.ArrayList;

public class Masa {
    
    private ArrayList<Urun> masaUruns= new ArrayList<Urun>();
    private int masaNo;
    private Boolean isOpen=false;
    private double bill=0;     

    public Masa(int masaNo) {
        this.masaNo = masaNo;
    }

    public int getMasaNo() {
        return masaNo;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }
    
    public  void  AddUruntoMasa(Urun b){       
        
        masaUruns.add(b);
    }
    
    public double takeCharge()
    {
           bill=0;
        for (Urun masaUrun : masaUruns) {
            bill+=masaUrun.calPrice();
        }
         return bill ;  
    }

    public ArrayList<Urun> getMasaUruns() {
        return masaUruns;
    }

    public void setMasaUruns(ArrayList<Urun> masaUruns) {
        this.masaUruns = masaUruns;
    }

    void delUrunFromMasa(int index) {
        masaUruns.remove(index);
     }

    public void setInitValue() {
        setIsOpen(false);
        getMasaUruns().clear();
        masaUruns.clear();
        bill=0;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    

    
    
    
    
            
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class SerbetliTatlılar extends Tatlılar{
    
    private String Icerigi;

    public SerbetliTatlılar(String sugar_type, String prepareType, String name, double price) {
        super(prepareType, name, price);
        this.Icerigi = sugar_type;
    }

    public String getIcerigi() {
        return Icerigi;
    }

    @Override
    public String getPrepareType() {
        return super.getPrepareType();
    }
    
    

    @Override
    public String toString() {
        return super.toString()+" Şeker Türü: "+Icerigi;
    }
    
    
}

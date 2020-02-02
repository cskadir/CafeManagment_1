/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class SogukIcecekler extends Icecekler{
    
    private double ice_amount;

    public SogukIcecekler(double ice_amount, String type, String name, double price) {
        super(type, name, price);
        this.ice_amount = ice_amount;
    }

    public double getIce_amount() {
        return ice_amount;
    }

    @Override
    public String getType() {
        return type;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+" Buz Miktarı: "+ice_amount;
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class Yemekler extends Urun implements IUrun{


   private String prepareTime;

    public Yemekler(String prepareTime, String name, double price) {
        super(name, price);
        this.prepareTime = prepareTime;
        
    }

    public String getPrepareTime() {
        return prepareTime;
    }
    @Override
    public double calPrice() {
        return price+calcKDV();
    }

    @Override
    public String toString() {
        return super.toString()+"  Hazırlanma süresi:  " + prepareTime;
    }
    @Override
    public double calcKDV() {
        return price*0.08;
    }
    
}

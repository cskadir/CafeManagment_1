/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class Atıştırmalıklar extends Yemekler{
 
     private String calori;

    public Atıştırmalıklar(String calori, String prepareTime, String name, double price) {
        super(prepareTime, name, price);
        this.calori = calori;
    }

    public String getCalori() {
        return calori;
    }

    @Override
    public String getPrepareTime() {
        return super.getPrepareTime(); 
    }

    @Override
    public String toString() {
        return super.toString()+" Kalori: "+calori;
    }
    
}

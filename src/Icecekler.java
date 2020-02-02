/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class Icecekler extends Urun implements IUrun{

    String type;

    public Icecekler(String type, String name, double price) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public double calPrice() {
        return price+calcKDV();
    }

    @Override
    public String toString() {
        return super.toString()+"  Türü:  " + type ;
    }

    @Override
    public double calcKDV() {
       return price*0.05;
    }
    }
    


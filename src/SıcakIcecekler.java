/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class SıcakIcecekler extends Icecekler{

    private double degree;

    public SıcakIcecekler(double degree, String type, String name, double price) {
        super(type, name, price);
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+"Sıcaklığı: "+degree;
    }
    
    
}

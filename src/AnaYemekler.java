 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class AnaYemekler  extends Yemekler{
    
    private String pisirmeOranı;

    public AnaYemekler(String amount_of_salt, String prepareTime, String name, double price) {
        super(prepareTime, name, price);
        this.pisirmeOranı = amount_of_salt;
    }  

    public String getAmount_of_salt() {
        return pisirmeOranı;
    }

    @Override
    public String getPrepareTime() {
        return super.getPrepareTime(); 
    }
    
    @Override
    public String toString() {
        return super.toString()+" Pisirme Oranı: "+pisirmeOranı;
    }
    
}

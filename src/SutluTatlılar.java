/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public class SutluTatlılar extends Tatlılar{
    
    private String WithWhat; 

    public SutluTatlılar(String is_what, String prepareType, String name, double price) {
        super(prepareType, name, price);
        this.WithWhat = is_what;
    }

    public String getWithWhat() {
        return WithWhat;
    }

    @Override
    public String getPrepareType() {
        return super.getPrepareType();
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"Ne ile : "+WithWhat;
    }
    
  
}


public class Tatlılar  extends Urun implements IUrun{
    
    String prepareType;

    public Tatlılar(String prepareType, String name, double price) {
        super(name, price);
        this.prepareType = prepareType;
    }

    public String getPrepareType() {
        return prepareType;
    }

    @Override
    public double calPrice() {
       return price+calcKDV();
    }

    @Override
    public String toString() {
        return super.toString()+"  Hazırlanma Şekli:  " + prepareType;
    }

    @Override
    public double calcKDV() {
        return price*0.03;
    }
}

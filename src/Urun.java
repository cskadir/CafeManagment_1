
public abstract class Urun {
    
    protected int id;
    protected String name;
    protected double price;
    protected static int totalUrun=0;

    public Urun(String name, double price) {
        id=100+totalUrun;
        this.name = name;
        this.price = price;
        totalUrun++;
        
    }
    
    public static int getTotalurun(){
        return totalUrun;
        
    }
    
    public abstract double calPrice();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Id: "+getId()+"  Isim:  " + name + "  Fiyat:  " + price+" ";
    }

    public static void setTotalUrun() {
        totalUrun--;
    }

    
    
    
            
    
    
    

    
}

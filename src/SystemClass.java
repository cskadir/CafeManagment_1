
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cScientist
 */
public  class  SystemClass  {
    
    public static List<Urun> urunler = new ArrayList<Urun>();
    public static List<Masa> masalar= new ArrayList<Masa>();
    private static String userName="kadiramazan";
    private static String password="2519";
    
    
    
    public static void writeToAnayemek()
	{
            try {
                File output = new File("yemekler.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof AnaYemekler)
                    {
                        pr.print(((AnaYemekler) urun).getAmount_of_salt()+" "+((AnaYemekler) urun).getPrepareTime()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    public static void writeToAtıstırmalık()
	{
            try {
                File output = new File("atıs.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof Atıştırmalıklar)
                    {
                        pr.print(((Atıştırmalıklar) urun).getCalori()+" "+((Atıştırmalıklar) urun).getPrepareTime()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    public static void writeSogukIcecek()
	{
            try {
                File output = new File("soguk.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof SogukIcecekler)
                    {
                        pr.print(((SogukIcecekler) urun).getIce_amount()+" "+((SogukIcecekler) urun).getType()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    public static void writeToSıcakIcecek()
	{
            try {
                File output = new File("sıcak.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof SıcakIcecekler)
                    {
                        pr.print(((SıcakIcecekler) urun).getDegree()+" "+((SıcakIcecekler) urun).getType()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    public static void writeToSutluTatlı()
	{
            try {
                File output = new File("sutlu.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof SutluTatlılar)
                    {
                        pr.print(((SutluTatlılar) urun).getWithWhat()+" "+((SutluTatlılar) urun).getPrepareType()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    public static void writeToSerbetliTatlı()
	{
            try {
                File output = new File("serbetli.txt");
                PrintWriter pr = new PrintWriter(output);

                for (Urun urun : urunler) {
                    if(urun instanceof SerbetliTatlılar)
                    {
                        pr.print(((SerbetliTatlılar) urun).getIcerigi()+" "+((SerbetliTatlılar) urun).getPrepareType()+" "+urun.getName()+" "+urun.getPrice());
                        pr.println();
                    }
                }
                pr.close();
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                 } catch (IOException ex) {
                ex.printStackTrace();
                  }
	}
    
    

    public static void readAnaYemek(){
        
        File input = new File("yemekler.txt");
        Scanner ss;
        try {
            ss = new Scanner(input);
            while(ss.hasNext())
            {
                AddUrun(new AnaYemekler(ss.next(), ss.next(), ss.next(),Double.parseDouble(ss.next())));
            }
            ss.close();
            

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
        
    }
    
   public static void readAtıstırmalık(){
        
        File input = new File("atıs.txt");
        Scanner s;
        try {
            s = new Scanner(input);
            while(s.hasNext())
            {
                AddUrun(new Atıştırmalıklar(s.next(), s.next(), s.next(), Double.parseDouble(s.next())));
            }
            s.close();

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
        
    }
   
   public static void readSıcaktIcecek(){
        
        File input = new File("sıcak.txt");
        Scanner s;
        try {
            s = new Scanner(input);
            while(s.hasNext())
            {
                AddUrun(new SıcakIcecekler(Double.parseDouble(s.next()), s.next(), s.next(), Double.parseDouble(s.next())));
            }
            s.close();

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
        
    }
   
   public static void readSogukIcecek(){
        
        File input = new File("soguk.txt");
        Scanner s;
        try {
            s = new Scanner(input);
            while(s.hasNext())
            {
                AddUrun(new SogukIcecekler(Double.parseDouble(s.next()), s.next(), s.next(), Double.parseDouble(s.next())));
            }
            s.close();

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
        
    }
   
   public static void readSutluTatlı(){
        
        File input = new File("sutlu.txt");
        Scanner s;
        try {
            s = new Scanner(input);
            while(s.hasNext())
            {
                AddUrun(new SutluTatlılar(s.next(), s.next(), s.next(), Double.parseDouble(s.next())));
            }
            s.close();

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
        
    }
   
   public static void readSerbetliTatlı(){
        
        File input = new File("serbetli.txt");
        Scanner s;
        try {
            s = new Scanner(input);
            while(s.hasNext())
            {
                AddUrun(new SerbetliTatlılar(s.next(), s.next(), s.next(), Double.parseDouble(s.next())));
            }
            s.close();

         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }       
    }
    
    
    public static String getUserName() {
        return userName;
    }

    public static String getPassword() {
        return password;
    }

    public static boolean AddUrun(Urun e){
        return urunler.add(e);
    }
    
    public static int searchUrun(int id)
    {
        int index=0;
        for (Urun urun : urunler) {
            if(id==urun.getId())
            {
                return index;
            }
            else
                index++;
        }
        return -1;
    }
    
    public static void delUrun(int index){
        
        urunler.remove(index);

    }
    
    public static String showUruns(){
        String str="";
        for (Urun myUrun : urunler) {
            str+=myUrun.toString()+"\n";
        }
        return str;    
    }
    
    
    public static boolean signIn(String username,String pp){
        if (userName.equals(username)&&password.equals(pp)) {
            return true;
        }
        else
            return false;
    }
}


package javaapplication1;

/**
 *
 * @author Margareta Bunga Kelore
 * TGL 08 Mei 2025
 * Contoh Class Overloading
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);
    }
    public void tulisSalam(String txt){
        System.out.println(txt);
        
    }
    public void tulisSalam(int angka){
        System.out.println(angka);    
    }
    
       
    }
    


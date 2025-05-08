
package pertemuan702;

/**
 *
 * @author Margareta Bunga Kelore
 * TGL 8 Mei 2025
 */
public class hewan {
    private String nama="";
    private String Suara;
    
    protected void setNama(String nm){
        this.nama = nm;   
    } 
    public String getNama(){
        return this.nama;
    }
    public void setSuara (String su) {
        this.Suara = su;
    }
    public String getSuara(){
        return this.Suara;
    }
}

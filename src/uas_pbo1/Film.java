//package
package uas_pbo1;

//class
public class Film {
    //atribut
    private String nama, id;

    //method constructor
    public Film(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    
    //method mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String id) {
        this.id = id;
    }
    
    //method accessor
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    //Overridden
    public String displayData(){
        return "Nama Pemesan: "+getNama()+ "\nID Film: "+getId();
    }
}


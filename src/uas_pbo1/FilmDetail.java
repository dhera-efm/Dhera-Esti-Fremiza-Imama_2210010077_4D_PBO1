package uas_pbo1;

public class FilmDetail extends Film {
    public FilmDetail(String nama, String id) {
        super(nama, id);
    }
    
    public String getJudul(){
        String id = getId().substring(0, 1);
        switch(id){
            case "1":
                return "Inside Out 2";
            case "2" :
                return "Interstellar";
            case "3" :
                return "World War Z";
            case "4" :
                return "Avengers";
            default:
                return "Film Lain";
        }
    }
    
    public String getCinema(){
        String id = getId().substring(1, 3);
        switch(id){
            case "01":
                return "1";
            case "02" :
                return "2";
            case "03" :
                return "3";
            case "04" :
                return "4";
            default:
                return "5";
        }
    }
    
    public String getPopCorn(){
        String id = getId().substring(3);
        if (id.equals("01")) {
            return "With PopCorn";
        } else {
            return "No PopCorn";
        }
    }
    
    @Override
    public String displayData(){
        return super.displayData()+ "\nJudul: "+getJudul()+ "\nCinema: "+getCinema()+ "\nSnack: "+getPopCorn();
    }
}

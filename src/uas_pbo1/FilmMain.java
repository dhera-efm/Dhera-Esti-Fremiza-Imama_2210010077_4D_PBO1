package uas_pbo1;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            FilmDetail[] film = new FilmDetail[2];

            //Perulangan
            for(int i=0; i<film.length; i++){
                System.out.print("Masukkan Nama Pemesan "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan ID Film "+(i+1)+" : ");
                String id = scanner.nextLine();

                //objek
                film[i] = new FilmDetail(nama, id);
            }

            for (FilmDetail detail: film){
                System.out.println("==============");
                System.out.println("Film Detail");
                System.out.println(detail.displayData());
            }
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("\nKesalahan Format Penulisan ID: "+e.getMessage());
            
        }  catch (Exception e){
            System.out.println("\nKesalahan Umum: "+e.getMessage());
        }
    }
}

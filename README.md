# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data film menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan ID Film, dan memberikan output berupa informasi detail dari ID tersebut seperti judul, cinema, dan snack.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Film`, `FilmDetail`, dan `FilmMain` adalah contoh dari class.

```bash
public class Film {
    ...
}

public class FilmDetail extends Film {
    ...
}

public class FilmMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `film[i] = new FilmDetail(nama, id);` adalah contoh pembuatan object.

```bash
film[i] = new FilmDetail(nama, id);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `id` adalah contoh atribut.

```bash
String nama;
String id;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Film(String nama, String id) {
    this.nama = nama;
    this.id = id;
}

public FilmDetail(String nama, String id) {
    super(nama, id);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setId` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setId(String id) {
    this.id = id;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`, `getJudul`, `getCinema`, dan `getPopCorn` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getId() {
    return id;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `id` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String id;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `FilmDetail` mewarisi `Film` dengan sintaks `extends`.

```bash
public class FilmDetail extends Film {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayData` di `FilmDetail` merupakan override dari method `displayData` di `Film`.

```bash
public String displayData(){
    return "Nama Pemesan: "+getNama()+ "\nID Film: "+getId();
}

@Override
public String displayData() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getJudul` dan `getCinema` dan `if else` dalam method `getPopCorn`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<film.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.print` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pemesan "+(i+1)+" : ");
String nama = scanner.nextLine();

System.out.println("Film Detail");
System.out.println(detail.displayData());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `FilmDetail[] film = new FilmDetail[2];` adalah contoh penggunaan array.

```bash
FilmDetail[] film = new FilmDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
  } catch (StringIndexOutOfBoundsException e){
    System.out.println("\nKesalahan Format Penulisan ID: "+e.getMessage());
            
  }  catch (Exception e){
    System.out.println("\nKesalahan Umum: "+e.getMessage());
  }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Dhera Esti Fremiza Imama
NPM: 2210010077

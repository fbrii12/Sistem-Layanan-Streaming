/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author ASUS
 */
public class Movie extends Content { 
    String judulFilm;
    String sutradara; 
    int tahunRilis;

    public Movie(String judulFilm, String sutradara, int tahunRilis, int playContent) {
        super(playContent); // panggil constructor parentContent
        this.judulFilm = judulFilm; this.sutradara = sutradara; this.tahunRilis = tahunRilis;
    }
    // Overriding method dari superclass Content @Override
    public void menontonKonten() { 
        super.menontonKonten();
        System.out.println("Menonton film: " + judulFilm);
    } 
    // Method asli
    public void informasiFilm() { 
        System.out.println("Judul Film: " + judulFilm);
        System.out.println("Sutradara: " + sutradara); 
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
    // Overloading method informasiFilm
    public void informasiFilm(boolean tampilkanSutradara) { 
        System.out.println("Judul Film: " + judulFilm);
        if (tampilkanSutradara) { System.out.println("Sutradara: " + sutradara);
    }
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}

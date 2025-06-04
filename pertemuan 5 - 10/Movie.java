/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layananstreaming;

/**
 *
 * @author adind
 */
public class Movie extends Content {
    String judulFilm;
    String sutradara;
    int tahunRilis;

    public Movie(String judulFilm, String sutradara, int tahunRilis, int playContent) {
        super(playContent); // panggil constructor parent Content
        this.judulFilm = judulFilm;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
    }

    // Overriding method dari superclass Content
    @Override
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
        if (tampilkanSutradara) {
            System.out.println("Sutradara: " + sutradara);
        }
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}



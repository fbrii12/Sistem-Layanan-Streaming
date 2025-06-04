/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ASUS
 */
public class Movie extends Content {
    private String judulFilm;
    private String sutradara;
    private int tahunRilis;

    public Movie(String judulFilm, String sutradara, int tahunRilis, int playContent) {
        super(playContent);
        this.judulFilm = judulFilm;
        this.sutradara = sutradara;
        this.tahunRilis = tahunRilis;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public void informasiFilm() {
        System.out.println("Judul Film: " + judulFilm);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }

    @Override
    public void menontonKonten() {
        super.menontonKonten();
        System.out.println("Menonton film: " + judulFilm);
    }
}

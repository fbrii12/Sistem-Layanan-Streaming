/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ASUS
 */
public class Content {

    private String namaLayanan;
    private String daftarKonten;
    private String namaPengguna;
    private String genre;
    private int hargaLangganan;
    private int duration;
    private int playContent;
    private int addContent;
    private int subscribe;
    private int showLibrary;

    public Content(String namaLayanan, String daftarKonten, int hargaLangganan) {
        this.namaLayanan = namaLayanan;
        this.daftarKonten = daftarKonten;
        this.hargaLangganan = hargaLangganan;
    }

    public Content(String namaPengguna, String genre) {
        this.namaPengguna = namaPengguna;
        this.genre = genre;
    }

    public Content(int playContent) {
        this.playContent = playContent;
    }

    // Getter dan Setter
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public String getDaftarKonten() {
        return daftarKonten;
    }

    public void setDaftarKonten(String daftarKonten) {
        this.daftarKonten = daftarKonten;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getHargaLangganan() {
        return hargaLangganan;
    }

    public void setHargaLangganan(int hargaLangganan) {
        this.hargaLangganan = hargaLangganan;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayContent() {
        return playContent;
    }

    public void setPlayContent(int playContent) {
        this.playContent = playContent;
    }

    public int getAddContent() {
        return addContent;
    }

    public void setAddContent(int addContent) {
        this.addContent = addContent;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public int getShowLibrary() {
        return showLibrary;
    }

    public void setShowLibrary(int showLibrary) {
        this.showLibrary = showLibrary;
    }

    // Method
    public void informasiLayanan() {
        System.out.println("Nama layanan streaming: " + namaLayanan);
        System.out.println("Daftar konten tersedia: " + daftarKonten);
        System.out.println("Harga langganan per bulan: Rp " + hargaLangganan);
    }

    public void informasiPengguna() {
        System.out.println("Nama pengguna: " + namaPengguna);
        System.out.println("Genre favorit pengguna: " + genre);
    }

    public void menontonKonten() {
        System.out.println("Jumlah konten yang telah diputar: " + playContent);
        System.out.println("Menikmati pengalaman menonton terbaik!");
    }

    public void menambahKonten() {
        System.out.println("Jumlah konten baru yang ditambahkan: " + addContent);
        System.out.println("Layanan streaming terus berkembang!");
    }

    public void langgananLayanan() {
        System.out.println("Jumlah pengguna yang berlangganan: " + subscribe);
        System.out.println("Layanan semakin populer!");
    }

    public void menampilkanPerpustakaan() {
        System.out.println("Jumlah konten dalam perpustakaan: " + showLibrary);
    }

//    public static void main(String[] args) {
//        Content layanan1 = new Content();
//        Content layanan2 = new Content();
//        Content layanan3 = new Content();
//
//        layanan1.setNamaLayanan("Netflix");
//        layanan1.setDaftarKonten("Film, Serial, Dokumenter");
//        layanan1.setHargaLangganan(150000);
//        layanan1.informasiLayanan();
//
//        layanan2.setNamaPengguna("Aldo");
//        layanan2.setGenre("Sci-Fi");
//        layanan2.informasiPengguna();
//
//        layanan3.setPlayContent(1000);
//        layanan3.menontonKonten();
//
//        layanan1.setAddContent(50);
//        layanan1.menambahKonten();
//
//        layanan1.setSubscribe(500000);
//        layanan1.langgananLayanan();
//
//        layanan1.setShowLibrary(10000);
//        layanan1.menampilkanPerpustakaan();
//    }
}

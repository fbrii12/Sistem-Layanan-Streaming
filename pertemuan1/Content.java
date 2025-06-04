/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Content;

/**
 *
 * @author ASUS
 */
public class Content {
    String namaLayanan, daftarKonten, namaPengguna, genre;
    int hargaLangganan, duration, playContent, addContent, subscribe, showLibrary;

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

    public static void main(String[] args) {
        Content layanan1 = new Content();
        Content layanan2 = new Content();
        Content layanan3 = new Content();

        layanan1.namaLayanan = "Netflix";
        layanan1.daftarKonten = "Film, Serial, Dokumenter";
        layanan1.hargaLangganan = 150000;
        layanan1.informasiLayanan();

        layanan2.namaPengguna = "Aldo";
        layanan2.genre = "Sci-Fi";
        layanan2.informasiPengguna();

        layanan3.playContent = 1000;
        layanan3.menontonKonten();

        layanan1.addContent = 50;
        layanan1.menambahKonten();

        layanan1.subscribe = 500000;
        layanan1.langgananLayanan();

        layanan1.showLibrary = 10000;
        layanan1.menampilkanPerpustakaan();
    }
}

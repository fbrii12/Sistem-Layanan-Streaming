package layananstreaming;

public class Content implements Layanan, Pengguna {
    String namaLayanan, daftarKonten, namaPengguna, genre;
    int hargaLangganan, playContent, addContent, subscribe, showLibrary;

    // Constructor untuk layanan streaming
    public Content(String namaLayanan, String daftarKonten, int hargaLangganan) {
        this.namaLayanan = namaLayanan;
        this.daftarKonten = daftarKonten;
        this.hargaLangganan = hargaLangganan;
    }

    // Constructor untuk pengguna
    public Content(String namaPengguna, String genre) {
        this.namaPengguna = namaPengguna;
        this.genre = genre;
    }

    // Constructor untuk konten yang diputar
    public Content(int playContent) {
        this.playContent = playContent;
    }

    // Implementasi metode dari interface Layanan
    @Override
    public void informasiLayanan() {
        System.out.println("Nama layanan streaming: " + namaLayanan);
        System.out.println("Daftar konten tersedia: " + daftarKonten);
        System.out.println("Harga langganan per bulan: Rp " + hargaLangganan);
    }

    @Override
    public void langgananLayanan(int subscribe) {
        this.subscribe = subscribe;
        System.out.println("Jumlah pengguna yang berlangganan: " + subscribe);
        System.out.println("Layanan semakin populer!");
    }

    @Override
    public void menampilkanPerpustakaan(int showLibrary) {
        this.showLibrary = showLibrary;
        System.out.println("Jumlah konten dalam perpustakaan: " + showLibrary);
    }

    // Implementasi metode dari interface Pengguna
    @Override
    public void informasiPengguna() {
        System.out.println("Nama pengguna: " + namaPengguna);
        System.out.println("Genre favorit pengguna: " + genre);
    }

    @Override
    public void menontonKonten() {
        System.out.println("Jumlah konten yang telah diputar: " + playContent);
        System.out.println("Menikmati pengalaman menonton terbaik!");
    }

    @Override
    public void menontonKonten(String judul) {
        System.out.println("Menonton konten berjudul: " + judul);
        System.out.println("Selamat menikmati!");
    }

    // Method menambah konten (bukan dari interface)
    public void menambahKonten(int addContent) {
        this.addContent = addContent;
        System.out.println("Jumlah konten baru yang ditambahkan: " + addContent);
        System.out.println("Layanan streaming terus berkembang!");
    }

    // Main untuk demo
    public static void main(String[] args) {
        Content layanan1 = new Content("Netflix", "Film, Serial, Dokumenter", 150000);
        Content pengguna1 = new Content("Aldo", "Sci-Fi");
        Content tontonan1 = new Content(1000);

        layanan1.informasiLayanan();
        pengguna1.informasiPengguna();
        tontonan1.menontonKonten();
        tontonan1.menontonKonten("Stranger Things");

        layanan1.menambahKonten(50);
        layanan1.langgananLayanan(500000);
        layanan1.menampilkanPerpustakaan(10000);
    }
}

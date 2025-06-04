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
public class UserPremium extends Content {
    int poinReward;
    boolean aksesEksklusif;

    public UserPremium(String namaPengguna, String genre, int poinReward, boolean aksesEksklusif) {
        super(namaPengguna, genre); // panggil constructor parent Content
        this.poinReward = poinReward;
        this.aksesEksklusif = aksesEksklusif;
    }

    // Overriding method dari Content
    @Override
    public void informasiPengguna() {
        super.informasiPengguna(); // opsional, bisa dihapus kalau ingin ubah sepenuhnya
        System.out.println("Status: Pengguna Premium");
    }

    // Method asli
    public void informasiPremium() {
        super.informasiPengguna();
        System.out.println("Poin reward: " + poinReward);
        System.out.println("Akses konten eksklusif: " + (aksesEksklusif ? "Ya" : "Tidak"));
    }

    // Overloading method informasiPremium
    public void informasiPremium(boolean tampilkanAksesEksklusif) {
        System.out.println("Poin reward: " + poinReward);
        if (tampilkanAksesEksklusif) {
            System.out.println("Akses konten eksklusif: " + (aksesEksklusif ? "Ya" : "Tidak"));
        }
    }
}



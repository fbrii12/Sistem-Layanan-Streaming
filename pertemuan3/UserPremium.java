/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

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

    public void informasiPremium() {
        super.informasiPengguna();
        System.out.println("Poin reward: " + poinReward);
        System.out.println("Akses konten eksklusif: " + (aksesEksklusif ? "Ya" : "Tidak"));
    }
}


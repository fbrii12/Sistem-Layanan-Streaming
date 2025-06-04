/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ASUS
 */
public class UserPremium extends Content {
    private int poinReward;
    private boolean aksesEksklusif;

    public UserPremium(String namaPengguna, String genre, int poinReward, boolean aksesEksklusif) {
        super(namaPengguna, genre); // panggil constructor parent Content
        this.poinReward = poinReward;
        this.aksesEksklusif = aksesEksklusif;
    }

    public int getPoinReward() {
        return poinReward;
    }

    public void setPoinReward(int poinReward) {
        this.poinReward = poinReward;
    }

    public boolean isAksesEksklusif() {
        return aksesEksklusif;
    }

    public void setAksesEksklusif(boolean aksesEksklusif) {
        this.aksesEksklusif = aksesEksklusif;
    }

    public void informasiPremium() {
        super.informasiPengguna();
        System.out.println("Poin reward: " + poinReward);
        System.out.println("Akses konten eksklusif: " + (aksesEksklusif ? "Ya" : "Tidak"));
    }
}

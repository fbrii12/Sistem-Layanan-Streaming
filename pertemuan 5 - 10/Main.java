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
public class Main {
    public static void main(String[] args) {
        // Objek bertipe Content tapi instance-nya Movie
        Content konten1 = new Movie("Inception", "Christopher Nolan", 2010, 5);
        konten1.menontonKonten(); // polymorphic call
        konten1.menontonKonten("Inception");

        System.out.println();

        // Objek bertipe Content tapi instance-nya UserPremium
        Content konten2 = new UserPremium("Budi", "Action", 100, true);
        konten2.menontonKonten(); // polymorphic call
        konten2.menontonKonten("Fast & Furious");

        System.out.println();

        // Jika kamu butuh akses method khusus di subclass, gunakan casting
        if (konten1 instanceof Movie) {
            ((Movie) konten1).informasiFilm();
        }

        if (konten2 instanceof UserPremium) {
            ((UserPremium) konten2).informasiPremium();
        }
    }
}


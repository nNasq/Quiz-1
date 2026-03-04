public class Buku10 {
    String kodeBuku;
    String judulBuku;
    String penulis;
    boolean statusDipinjam;

    public Buku10(String kodeBuku, String judulBuku, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.statusDipinjam = false;
    }

    public void tampilkanInfo() {
        System.out.println(kodeBuku + " - " + judulBuku + " oleh " + penulis +
                " | Status: " + (statusDipinjam ? "Dipinjam" : "Tersedia"));
    }
}
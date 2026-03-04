public class Mahasiswa10 {
    String nama;
    String nim;
    Buku10[] bukuDipinjam;
    int jumlahPinjam;

    public Mahasiswa10(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new Buku10[2];
        this.jumlahPinjam = 0;
    }

    public boolean pinjamBuku(Buku10 buku) {
        if (jumlahPinjam >= 2) {
            System.out.println("Gagal: " + nama + " sudah meminjam 2 buku.");
            return false;
        }
        if (buku.statusDipinjam) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain.");
            return false;
        }

        bukuDipinjam[jumlahPinjam] = buku;
        jumlahPinjam++;
        buku.statusDipinjam = true;

        System.out.println(nama + " berhasil meminjam buku: " + buku.judulBuku);
        return true;
    }

    public void kembalikanBuku(String kodeBuku) {
        for (int i = 0; i < jumlahPinjam; i++) {
            if (bukuDipinjam[i].kodeBuku.equals(kodeBuku)) {

                String judul = bukuDipinjam[i].judulBuku;

                bukuDipinjam[i].statusDipinjam = false;

                for (int j = i; j < jumlahPinjam - 1; j++) {
                    bukuDipinjam[j] = bukuDipinjam[j + 1];
                }

                bukuDipinjam[jumlahPinjam - 1] = null;
                jumlahPinjam--;

                System.out.println(nama + " berhasil mengembalikan " + judul);
                return;
            }
        }
        System.out.println("Buku tidak ditemukan dalam daftar pinjaman.");
    }

    public void tampilkanPinjaman() {
        if (jumlahPinjam > 0) {
            System.out.print(nama + " meminjam: ");
            for (int i = 0; i < jumlahPinjam; i++) {
                System.out.print(bukuDipinjam[i].judulBuku);
                if (i < jumlahPinjam - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}

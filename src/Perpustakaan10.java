public class Perpustakaan10 {
    Buku10[] daftarBuku;
    Mahasiswa10[] daftarMahasiswa;
    int jumlahBuku;
    int jumlahMahasiswa;

    public Perpustakaan10() {
        this.daftarBuku = new Buku10[100];
        this.daftarMahasiswa = new Mahasiswa10[100];
        this.jumlahBuku = 0;
        this.jumlahMahasiswa = 0;
    }

    public void tambahBuku(Buku10 buku) {
        daftarBuku[jumlahBuku++] = buku;
        System.out.println("Buku " + buku.judulBuku + " berhasil ditambahkan.");
    }

    public void tambahMahasiswa(Mahasiswa10 mhs) {
        daftarMahasiswa[jumlahMahasiswa++] = mhs;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan.");
    }

    public Buku10 cariBuku(String kode) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    public Mahasiswa10 cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku: ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            daftarMahasiswa[i].tampilkanPinjaman();
        }
    }
}

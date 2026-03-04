import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Perpustakaan10 perpus = new Perpustakaan10();
        int pilihan;

        System.out.println("Menu Perpustakaan:");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Peminjaman");
        System.out.println("6. Keluar");

        do {
            System.out.print("\nPilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("\nMasukkan kode buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();

                    perpus.tambahBuku(new Buku10(kode, judul, penulis));
                    break;

                case 2:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();

                    perpus.tambahMahasiswa(new Mahasiswa10(nim, nama));
                    break;

                case 3:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nimPinjam = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodePinjam = sc.nextLine();

                    Mahasiswa10 m = perpus.cariMahasiswa(nimPinjam);
                    Buku10 b = perpus.cariBuku(kodePinjam);

                    if (m != null && b != null) {
                        m.pinjamBuku(b);
                    } else {
                        System.out.println("Data mahasiswa atau buku tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nimKembali = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodeKembali = sc.nextLine();

                    Mahasiswa10 mk = perpus.cariMahasiswa(nimKembali);
                    if (mk != null) {
                        mk.kembalikanBuku(kodeKembali);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 5:
                    perpus.tampilkanPeminjaman();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 6);
    }
}
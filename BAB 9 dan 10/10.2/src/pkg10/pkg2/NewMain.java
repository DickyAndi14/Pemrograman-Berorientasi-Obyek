import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Main bukuAlamat = new Main();

        int pilihan = 0;

        do {
            System.out.println("=== BUKU ALAMAT ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampil Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = input.next();
                    System.out.print("Masukkan Telepon: ");
                    String telepon = input.next();
                    bukuAlamat.tambahData(nama, alamat, telepon);
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan Index Data yang akan dihapus: ");
                    int indexHapus = input.nextInt();
                    bukuAlamat.hapusData(indexHapus - 1);
                    System.out.println("Data berhasil dihapus.");
                    break;
                case 3:
                    bukuAlamat.tampilData();
                    break;
                case 4:
                    System.out.print("Masukkan Index Data yang akan diupdate: ");
                    int indexUpdate = input.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String namaUpdate = input.next();
                    System.out.print("Masukkan Alamat: ");
                    String alamatUpdate = input.next();
                    System.out.print("Masukkan Telepon: ");
                    String teleponUpdate = input.next();
                    bukuAlamat.updateData(indexUpdate - 1, namaUpdate, alamatUpdate, teleponUpdate);
                    System.out.println("Data berhasil diupdate.");
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (pilihan != 5);
    }
}

    public class Main {
    private final String[] nama = new String[100];
    private final String[] alamat = new String[100];
    private final String[] telepon = new String[100];
    private int jumlahData = 0;

    public void tambahData(String nama, String alamat, String telepon) {
        this.nama[jumlahData] = nama;
        this.alamat[jumlahData] = alamat;
        this.telepon[jumlahData] = telepon;
        jumlahData++;
    }

    public void hapusData(int index) {
        if (index >= 0 && index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                nama[i] = nama[i + 1];
                alamat[i] = alamat[i + 1];
                telepon[i] = telepon[i + 1];
            }
            jumlahData--;
        }
    }

    public void tampilData() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama: " + nama[i]);
            System.out.println("Alamat: " + alamat[i]);
            System.out.println("Telepon: " + telepon[i]);
            System.out.println("-----------------------");
        }
    }

    public void updateData(int index, String nama, String alamat, String telepon) {
        if (index >= 0 && index < jumlahData) {
            this.nama[index] = nama;
            this.alamat[index] = alamat;
            this.telepon[index] = telepon;
        }
    }
}


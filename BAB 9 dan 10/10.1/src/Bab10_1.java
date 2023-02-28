    public class Bab10_1 {
    private String nama, alamat, telepon, mail;
    public Bab10_1 (String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public Bab10_1(String alamat, String telepon, String mail) {
        this.alamat = alamat;
        this.telepon = telepon;
        this.mail = mail;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelepon() {
        return telepon;
    }
    public String getMail() {
        return mail;
    }
}
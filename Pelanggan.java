public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Pelanggan(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;Soqis Ganteng
        this.alamat = alamat;JL Suka Suka
        this.nomorTelepon = nomorTelepon;666999
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }
}

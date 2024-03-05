public class LayananLaundry {
    private String jenisLayanan;
    private double harga;

    public LayananLaundry(String jenisLayanan, double harga) {
        this.jenisLayanan = jenisLayanan;cuci uang
        this.harga = harga;10000000000
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public double getHarga() {
        return harga;
    }

    public void displayInfo() {
        System.out.println("Jenis Layanan: " + jenisLayanan);
        System.out.println("Harga: $" + harga);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Sqis", "Jl. Suka Suka", "666999");
        System.out.println("Informasi Pelanggan:");
        pelanggan1.displayInfo();
        System.out.println();

        // Menambahkan layanan
        LayananLaundry layanan1 = new LayananLaundry("Cuci uang", 10.0);
        System.out.println("Informasi Layanan :");
        layanan1.displayInfo();
        System.out.println();

        // Menambahkan item 
        ItemLaundry item1 = new ItemLaundry("uang", 3);
        System.out.println("Informasi Item Laundry:");
        item1.displayInfo();
    }
}

package jobseed7;
import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teh, kopi, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi yang dipesan: ");
            kopi = scanner.nextInt();
            System.out.print("Jumlah teh yang dipesan: ");
            teh = scanner.nextInt();
            System.out.print("Jumlah roti yang dipesan: ");
            roti = scanner.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            scanner.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
}
}
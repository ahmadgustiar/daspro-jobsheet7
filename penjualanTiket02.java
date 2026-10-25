import java.util.Scanner;

public class penjualanTiket02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int hargaPerTiket = 50000;

        System.out.println("Ketik angka 0 pada jumlah tiket untuk menutup penjualan hari ini.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Silakan input ulang.\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            double hargaSebelumDiskon = jumlahTiket * hargaPerTiket;
            double potonganHarga = hargaSebelumDiskon * diskon;
            double hargaBayar = hargaSebelumDiskon - potonganHarga;
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaBayar;

            System.out.println("Total bayar tiket : Rp " + hargaBayar + "\n");
        }
        System.out.println("Total tiket yang terjual hari ini : " + totalTiketTerjual);
        System.out.println("Total harga penjualan hari ini    : Rp " + totalPenjualan);
    }
}
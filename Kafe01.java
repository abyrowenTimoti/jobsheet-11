import java.util.Scanner;

public class Kafe01 {
  public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
      System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equals("DISKON50")) {
      System.out.println("Kode promo berlaku: Anda mendapatkan diskon 50%!");
    } else if (kodePromo.equals("DISKON30")) {
      System.out.println("Kode promo berlaku: Anda mendapatkan diskon 30%!");
    } else {
      System.out.println("Kode promo invalid.");
    }

    System.out.println("====Menu Resto Kafe===");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappucino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==============================");
    System.out.println("Silahkan pilih menu yang anda inginkan");
  }

  public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
    int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

    if (kodePromo.equals("DISKON50")) {
      int diskon = hargaTotal * 50 / 100;
      hargaTotal -= diskon;
      System.out.println("Diskon 50%");
    } else if (kodePromo.equals("DISKON30")) {
      int diskon = hargaTotal * 30 / 100;
      hargaTotal -= diskon;
      System.out.println("Diskon 30%");
    } else {
      System.out.println("Kode promo invalid. Tidak ada diskon.");
    }
    return hargaTotal;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu("Budi", false, "DISKON30");
    int totalKeseluruhan = 0;
    String lanjut;
    do {
      System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
      int pilihanMenu = sc.nextInt();
      System.out.print("Masukkan jumlah item yang ingin dipesan: ");
      int banyakItem = sc.nextInt();

      int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, "DISKON30");
      totalKeseluruhan += totalHarga;

      System.out.print("Apakah ingin menambah pesanan lagi? (ya/tidak): ");
      lanjut = sc.next();
    } while (lanjut.equalsIgnoreCase("ya"));

    System.out.println("\n=== Pesanan ===");
    System.out.println("Total keseluruhan pesanan anda: Rp " + totalKeseluruhan);
  }
}
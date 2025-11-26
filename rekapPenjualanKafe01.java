import java.util.Scanner;

public class rekapPenjualanKafe01 {
    static void inputData(int[][] dataPenjualan, String[] namaMenu, Scanner sc) {
        sc.nextLine(); 

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("-------------------------------------");
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine(); 
            System.out.println("Input data penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            sc.nextLine(); 
        }
    }

    static void tampilkanData(int[][] dataPenjualan, String[] namaMenu) {
        System.out.println("\n========= REKAP DATA PENJUALAN =========");
        System.out.print("Menu\t\t");
        for (int j = 0; j < dataPenjualan[0].length; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t\t"); 
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] dataPenjualan, String[] namaMenu) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = namaMenu[i];
            }
        }
        System.out.println("\n>>> MENU TERLARIS <<<");
        System.out.println("Menu: " + menuTerlaris);
        System.out.println("Total Penjualan: " + maxPenjualan);
    }

    static void rataRata(int[][] dataPenjualan, String[] namaMenu) {
        System.out.println("\n>>> RATA-RATA PENJUALAN PER MENU <<<");
        for (int i = 0; i < dataPenjualan.length; i++) {
            double totalPerMenu = 0;
            int jumlahHari = dataPenjualan[0].length;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }
            double rata = totalPerMenu / jumlahHari;
            System.out.printf("Menu %s: %.2f\n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEM REKAP PENJUALAN KAFE BU MARIANA ---");
        System.out.print("Masukkan Jumlah Menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari Penjualan: ");
        int jumlahHari = sc.nextInt();
        String[] namaMenu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];
        inputData(dataPenjualan, namaMenu, sc);
        tampilkanData(dataPenjualan, namaMenu);
        menuTertinggi(dataPenjualan, namaMenu);
        rataRata(dataPenjualan, namaMenu);
        sc.close();
    }
}
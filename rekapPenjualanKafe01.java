public class rekapPenjualanKafe01 {
    String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    void tampilkanDataPenjualan() {
        System.out.println("Data Penjualan:");
        System.out.println("Menu / Hari 1 2 3 4 5 6 7");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    void tampilkanMenuTerlaris() {
        int maxTotal = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu Terlaris: " + menuTerlaris + " dengan total penjualan " + maxTotal);
    }
    void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + ": " + rata);
        }
    }
    public static void main(String[] args) {
        rekapPenjualanKafe01 cafe = new rekapPenjualanKafe01();
        cafe.tampilkanDataPenjualan();
        cafe.tampilkanMenuTerlaris();
        cafe.tampilkanRataRataPenjualan();
    }
}
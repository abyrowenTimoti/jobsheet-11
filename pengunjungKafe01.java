public class pengunjungKafe01 {
  static void daftarPengunjung(String... namaPengunjung){
    System.out.println("Daftar nama pengunjung: ");
    for(String pengunjung : namaPengunjung){
      System.out.println("- " + pengunjung);
    }
  }
  public static void main(String[] args) {
    daftarPengunjung("Ali", "Budi", "Citra");
    daftarPengunjung();
    daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
  }
}
import java.util.Scanner;
public class nilaiMahasiswa01 {
  static void isianArray(int[] arr){
    Scanner sc=new Scanner(System.in);
    for(int i=0; i<arr.length; i++){
      System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+": ");
      arr[i]=sc.nextInt();
    }
  }
  static void tampilArray(int[] arr){
    System.out.println("\nDaftar nilai mahasiswa: ");
    for (int i=0; i<arr.length; i++){
      System.out.println("Mahasiswa ke-"+ (i+1)+ ": "+ arr[i]);
    }
  }
  static int hitTot(int[] arr){
    int total=0;
    for(int nilai : arr){
      total += nilai;
    }
    return total;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int N =sc.nextInt();
    int[] nilaiMahasiswa = new int[N];
    isianArray(nilaiMahasiswa);
    tampilArray(nilaiMahasiswa);
    int totalNilai=hitTot(nilaiMahasiswa);
    System.out.println("\nTotal nilai seluruh mahasiswa = "+ totalNilai);
    sc.close();
  }
}

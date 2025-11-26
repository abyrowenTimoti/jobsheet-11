import java.util.Scanner;
public class kubus01 {
  static int hitunglp(int sisi){
    int lp=sisi*sisi*6;
    return lp;
  }
  static int hitungVolume(int sisi){
    int volume=sisi*sisi*sisi;
    return volume;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int vol, luasPermukaan;
    System.out.print("Masukkan sisi kubus: ");
    int sisi=sc.nextInt();

    vol=hitungVolume(sisi);
    System.out.println("Volume kubus adalah "+vol);
    luasPermukaan=hitunglp(sisi);
    System.out.println("Luas permukaan kubus adalah "+ luasPermukaan);
  }
}

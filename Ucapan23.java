import java.util.Scanner;

public class Ucapan23 {

    public static String PenerimaanUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang Yang Ingin Anda Beri Ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaanUcapan();
        System.out.println("Thank You "+nama+"\nMay teh force be with you.");
    }
}
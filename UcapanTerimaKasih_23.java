import java.util.Scanner;
public class UcapanTerimaKasih_23 {

    public static String penerimaUcapan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = scanner.nextLine();
        scanner.close();
        return namaOrang;
    }

    public static void ucapanTerimaKasih() {
        String nama = penerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        ucapanTerimaKasih();
        UcapanTambahan("Semoga Anda selalu diberikan kesehatan dan kebahagiaan.");
    }
}

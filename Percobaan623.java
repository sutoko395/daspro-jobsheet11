import java.util.Scanner;

public class Percobaan623 {
    static int hitungLuas(int p, int l) {
        return p * l;
    }
    static int hitungVolume(int tinggi, int p, int l) {
        return hitungLuas(p, l) * tinggi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, vol, L;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah: " + vol);

        input.close();
    }
}

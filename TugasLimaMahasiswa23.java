import java.util.Scanner;

public class TugasLimaMahasiswa23 {
    // Fungsi untuk menginputkan data nilai mahasiswa
    public static void inputNilai(int[][] nilai, String[] namaMahasiswa, int mahasiswa, int tugas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < tugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilai(int[][] nilai, String[] namaMahasiswa, int mahasiswa, int tugas) {
        System.out.println("Nilai mahasiswa dari tugas pertama hingga terakhir:");
        for (int i = 0; i < mahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < tugas; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada tugas keberapa terdapat nilai tertinggi dibanding tugas lainnya dari keseluruhan mahasiswa
    public static void cariTugasNilaiTertinggi(int[][] nilai, int mahasiswa, int tugas) {
        int maxNilai = Integer.MIN_VALUE;
        int tugasTertinggi = -1;
        for (int j = 0; j < tugas; j++) {
            int totalNilai = 0;
            for (int i = 0; i < mahasiswa; i++) {
                totalNilai += nilai[i][j];
            }
            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                tugasTertinggi = j + 1; // Tugas dimulai dari 1
            }
        }
        System.out.println("Tugas dengan nilai tertinggi adalah tugas ke-" + tugasTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void cariMahasiswaNilaiTertinggi(int[][] nilai, String[] namaMahasiswa, int mahasiswa, int tugas) {
        int maxNilai = Integer.MIN_VALUE;
        String mahasiswaTertinggi = "";
        int tugasTertinggi = -1;
        for (int i = 0; i < mahasiswa; i++) {
            for (int j = 0; j < tugas; j++) {
                if (nilai[i][j] > maxNilai) {
                    maxNilai = nilai[i][j];
                    mahasiswaTertinggi = namaMahasiswa[i];
                    tugasTertinggi = j + 1; // Tugas dimulai dari 1
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswaTertinggi + " pada tugas ke-" + tugasTertinggi + " dengan nilai " + maxNilai);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int tugas = scanner.nextInt();

        int[][] nilai = new int[mahasiswa][tugas];
        String[] namaMahasiswa = new String[mahasiswa];

        for (int i = 0; i < mahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
        }

        // Input nilai mahasiswa
        inputNilai(nilai, namaMahasiswa, mahasiswa, tugas);

        // Tampilkan semua nilai mahasiswa
        tampilkanNilai(nilai, namaMahasiswa, mahasiswa, tugas);

        // Cari tugas dengan nilai tertinggi
        cariTugasNilaiTertinggi(nilai, mahasiswa, tugas);

        // Cari mahasiswa dengan nilai tertinggi
        cariMahasiswaNilaiTertinggi(nilai, namaMahasiswa, mahasiswa, tugas);
        
        scanner.close();
    }
}

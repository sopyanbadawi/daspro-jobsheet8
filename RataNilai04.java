import java.util.Scanner;
public class RataNilai04 {
    public static void main(String[] args) {
    int i,j;
    float nilai,totalNilai,rataNilai;
    Scanner sc = new Scanner(System.in);

        i = 1;
        while (i<=5) {
            totalNilai = 0;
            System.out.println("Nilai mahasiswa ke " + i);
            for(j=1;j<=5;j++){
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;

            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}

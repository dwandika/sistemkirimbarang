
import java.util.Scanner;

public class VolumeBalok {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukan Panjang Balok : ");
        double p = masukan.nextDouble();

        System.out.print("Masukan Lebar Balok : ");
        double l = masukan.nextDouble();

        System.out.print("Masukan Tinggi Balok : ");
        double t = masukan.nextDouble();

        double Volumebalok = HitungVolumeBalok(p, l, t);
        double LuasPermukaan = LuasPermukaanBalok(p, l, t);

        System.out.println("Hasil Volume Balok = " + Volumebalok);
        System.out.println("Hasil Luas Permukaan Balok = "+LuasPermukaan);
    }

    public static double LuasPermukaanBalok(double p, double l, double t) {
        double luas;
        luas = 2 * ((p * l) + (p * t) + (l * t));
        return luas;
    }

    public static double HitungVolumeBalok(double p, double l, double t) {
        double volume;
        volume = p * l * t;
        return volume;
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Barang {
    String id;
    String namaPenerima;
    String alamatTujuan;

    Barang(String id, String namaPenerima, String alamatTujuan) {
        this.id = id;
        this.namaPenerima = namaPenerima;
        this.alamatTujuan = alamatTujuan;
    }
}

public class SistemPengirimanBarang {
    private Queue<Barang> antrianPengiriman = new LinkedList<>();

    public void tambahBarang(String id, String namaPenerima, String alamatTujuan) {
        Barang barang = new Barang(id, namaPenerima, alamatTujuan);
        antrianPengiriman.add(barang);
        System.out.println("Barang berhasil ditambahkan ke antrian.");
    }

    public void hapusBarang() {
        Barang barang = antrianPengiriman.poll();
        if (barang != null) {
            System.out.println("Barang berhasil dihapus dari antrian: ID: " + barang.id + ", Penerima: " + barang.namaPenerima + ", Alamat: " + barang.alamatTujuan);
        } else {
            System.out.println("Antrian kosong, tidak ada barang yang dihapus.");
        }
    }

    public void lihatBarang() {
        if (antrianPengiriman.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (Barang barang : antrianPengiriman) {
                System.out.println("ID: " + barang.id + ", Penerima: " + barang.namaPenerima + ", Alamat: " + barang.alamatTujuan);
            }
        }
    }

    public void cekStatusAntrian() {
        if (antrianPengiriman.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah barang dalam antrian: " + antrianPengiriman.size());
        }
    }

    public void cariBarang(String id) {
        for (Barang barang : antrianPengiriman) {
            if (barang.id.equals(id)) {
                System.out.println("Barang ditemukan: ID: " + barang.id + ", Penerima: " + barang.namaPenerima + ", Alamat: " + barang.alamatTujuan);
                return;
            }
        }
        System.out.println("Barang dengan ID " + id + " tidak ditemukan.");
    }

    public void perbaruiBarang(String id, String namaPenerimaBaru, String alamatTujuanBaru) {
        for (Barang barang : antrianPengiriman) {
            if (barang.id.equals(id)) {
                barang.namaPenerima = namaPenerimaBaru;
                barang.alamatTujuan = alamatTujuanBaru;
                System.out.println("Barang berhasil diperbarui: ID: " + barang.id + ", Penerima: " + barang.namaPenerima + ", Alamat: " + barang.alamatTujuan);
                return;
            }
        }
        System.out.println("Barang dengan ID " + id + "tidak ditemukan.");
    }

    public static void main(String[] args) {
        SistemPengirimanBarang sistem = new SistemPengirimanBarang();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Lihat Barang");
            System.out.println("4. Cek Status Antrian");
            System.out.println("5. Cari Barang");
            System.out.println("6. Perbarui Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Barang: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Penerima: ");
                    String namaPenerima = scanner.nextLine();
                    System.out.print("Masukkan Alamat Tujuan: ");
                    String alamatTujuan = scanner.nextLine();
                    sistem.tambahBarang(id, namaPenerima, alamatTujuan);
                    break;
                case 2:
                    sistem.hapusBarang();
                    break;
                case 3:
                    sistem.lihatBarang();
                    break;
                case 4:
                    sistem.cekStatusAntrian();
                    break;
                case 5:
                    System.out.print("Masukkan ID Barang yang Dicari: ");
                    String idCari = scanner.nextLine();
                    sistem.cariBarang(idCari);
                    break;
                case 6:
                    System.out.print("Masukkan ID Barang yang Akan Diperbarui: ");
                    String idUpdate = scanner.nextLine();
                    System.out.print("Masukkan Nama Penerima Baru: ");
                    String namaPenerimaBaru = scanner.nextLine();
                    System.out.print("Masukkan Alamat Tujuan Baru: ");
                    String alamatTujuanBaru = scanner.nextLine();
                    sistem.perbaruiBarang(idUpdate, namaPenerimaBaru, alamatTujuanBaru);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

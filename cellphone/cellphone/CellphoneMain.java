package cellphone;

import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        String merk, tipe;
        char hidup;
        boolean menu = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("==Masukkan Merk dan Tipe ponsel==");
        System.out.print("Merk  :");
        merk = sc.nextLine();
        System.out.print("Tipe  :");
        tipe = sc.nextLine();

        Contact cnt = new Contact(merk, tipe);
        System.out.println("Ponsel : " + merk + " " + tipe);
        System.out.println("Hidupkan ponsel ? (y/t)");
        hidup = sc.next().charAt(0);
        if (hidup == 'Y' || hidup == 'y') {
            cnt.powerOn();
        } else {
            cnt.powerOff();
        }

        do {
            System.out.println("==Apa yang ingin anda lakukan pada ponsel ? ==");
            System.out.println("1. Menyalakan Ponsel");
            System.out.println("2. Mematikan Ponsel");
            System.out.println("3. TopUp Pulsa");
            System.out.println("4. Cek Pulsa");
            System.out.println("5. Tambah Kontak");
            System.out.println("6. Lihat Semua Kontak");
            System.out.println("7. Cari Kontak");
            System.out.println("8. Volume Down");
            System.out.println("9. Volume Up");
            System.out.println("10. Matikan dan Keluar");
            System.out.println("===============================================");
            System.out.print("Pilihan : ");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    cnt.powerOn();
                    break;
                case 2:
                    cnt.powerOff();
                    break;
                case 3:
                    System.out.print("Berapa jumlah pulsa yang ingin anda beli ? ");
                    int pulsa = sc.nextInt();
                    sc.nextLine();
                    cnt.topupPulsa(pulsa);
                    break;
                case 4:
                    cnt.cekSisaPulsa();
                    break;
                case 5:
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Nomor HP : ");
                    String no = sc.nextLine();
                    cnt.tambahKontak(nama, no);
                    break;
                case 6:
                    cnt.lihatSemuaKontak();
                    break;
                case 7:
                    System.out.print("Masukkan Nama : ");
                    String cari = sc.nextLine();
                    cnt.cariKontak(cari);
                    break;
                case 8:
                    cnt.volumeDown();
                    System.out.println("Volume ponsel sekarang : " + cnt.getVolume());
                    break;
                case 9:
                    cnt.volumeUp();
                    System.out.println("Volume ponsel sekarang : " + cnt.getVolume());
                    break;
                case 10:
                    cnt.powerOff();
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan anda salah");
                    break;
            }

        } while (menu);
        sc.close();
    }
}

package cellphone;

import java.util.HashMap;
import java.util.Map;

public class Contact extends Cellphone {
    private String nama;
    private String nomor;
    private Map<String, String> daftarKontak;
    public Contact(String merk, String type) {
        super(merk, type);
        daftarKontak = new HashMap<>(); 
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }
    
    public void tambahKontak(String nama, String nomor) {
        if (getStatus() == 1) {
            daftarKontak.put(nama, nomor); 
            System.out.println("Kontak berhasil ditambahkan");
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi tambah kontak.");
        }
    }

    private int getStatus() {
        return 0;
    }

    public Map<String, String> getDaftarKontak() {
        return daftarKontak;
    }

    // Implementasi metode getStatus() dan metode lainnya
    

    public void lihatSemuaKontak() {
        if (getStatus() == 1) {
            if (daftarKontak.isEmpty()) {
                System.out.println("Tidak ada kontak yang tersimpan");
            } else {
                System.out.println("Daftar Kontak:");
                for (String nama : daftarKontak.keySet()) {
                    String nomor = daftarKontak.get(nama);
                    System.out.println("Nama: " + nama + ", Nomor: " + nomor);
                }
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi lihat semua kontak.");
        }
    }

    public void cariKontak(String nama) {
        if (getStatus() == 1) {
            if (daftarKontak.containsKey(nama)) {
                String nomor = daftarKontak.get(nama);
                System.out.println("Nama: " + nama + ", Nomor: " + nomor);
            } else {
                System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cari kontak.");
        }
    }
}

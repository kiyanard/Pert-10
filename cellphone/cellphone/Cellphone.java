package cellphone;
import java.util.HashMap;
import java.util.Map;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int pulsa=0;
    Map<String, String> daftarKontak;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
        if (batteryLevel >= MAX_BATT_LEVEL) {
            batteryLevel = MAX_BATT_LEVEL;
        } else if (batteryLevel <= MIN_BATT_LEVEL) {
            batteryLevel = MIN_BATT_LEVEL;
        }
        daftarKontak = new HashMap<>();
    }

        public void powerOn() {
            if (status == 1) {
                System.out.println("Ponsel sudah menyala!");
            } else {
                this.status = 1;
                System.out.println("Menyalakan ponsel");
            }
        }
    
        public void powerOff() {
            if (status == 0) {
                System.out.println("Ponsel sudah mati!");
            } else {
                this.status = 0;
                System.out.println("Mematikan ponsel");
            }
        }
    
        public void volumeUp() {
            if (this.status == 0) {
                System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
            } else {
                this.volume++;
                if (this.volume >= MAX_VOLUME) {
                    this.volume = MAX_VOLUME;
                }
            }
        }
    
        public void volumeDown() {
            if (this.status == 0) {
                System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
            } else {
                this.volume--;
                if (this.volume <= MIN_VOLUME) {
                    this.volume = MIN_VOLUME;
                }
            }
        }
    
        public int getVolume() {
            return this.volume;
        }
    
        public void topupPulsa(int jumlah) {
            if (status == 1) {
                pulsa += jumlah;
                System.out.println("Top up pulsa berhasil. Pulsa sekarang: " + pulsa);
            } else {
                System.out.println("Ponsel mati. Tidak dapat melakukan operasi top up pulsa.");
            }
        }
    
        public void cekSisaPulsa() {
            if (status == 1) {
                System.out.println("Sisa pulsa: " + pulsa);
            } else {
                System.out.println("Ponsel mati. Tidak dapat melakukan operasi cek sisa pulsa.");
            }
        }
    }
    

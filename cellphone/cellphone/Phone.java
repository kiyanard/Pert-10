package cellphone;

public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    int MAX_BATT_LEVEL = 100;
    int MIN_BATT_LEVEL = 0;

    void powerOn();

    void powerOff();

    void volumeUp();

    void volumeDown();

    int getVolume();
}


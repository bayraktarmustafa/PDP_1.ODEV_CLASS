/**
 * Motor sınıfı, araçların motor özelliklerini temsil eder.
 */
public class Motor {
    private int beygirGucu;
    private String yakitTuru;

    /**
     * Motor sınıfının kurucu metodu.
     * @param beygirGucu Motorun beygir gücü.
     * @param yakitTuru Motorun kullandığı yakıt türü.
     */
    public Motor(int beygirGucu, String yakitTuru) {
        this.beygirGucu = beygirGucu;
        this.yakitTuru = yakitTuru;
    }

    /**
     * Motorun beygir gücünü getirir.
     * @return Motorun beygir gücü.
     */
    public int getBeygirGucu() {
        return beygirGucu;
    }

    /**
     * Motorun kullandığı yakıt türünü getirir.
     * @return Motorun yakıt türü.
     */
    public String getYakitTuru() {
        return yakitTuru;
    }

    // Motorun çalıştığını gösteren metod
    public void calis() {
        System.out.println("Motor çalıştı.");
    }
}


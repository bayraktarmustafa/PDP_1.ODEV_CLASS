/**
 * Motor sınıfı, motor nesnelerini temsil eder.
 */
public class Motor {

    private String marka;
    private double beygirGucu;

    /**
     * Motor sınıfı için kurucu method.
     * @param marka motorun markası
     * @param beygirGucu motorun beygir gücü
     */
    public Motor(String marka, double beygirGucu) {
        this.marka = marka;
        this.beygirGucu = beygirGucu;
    }

    /**
     * Motorun markasını döndüren method.
     * @return motorun markası
     */
    public String getMarka() {
        return marka;
    }

    /**
     * Motorun beygir gücünü döndüren method.
     * @return motorun beygir gücü
     */
    public double getBeygirGucu() {
        return beygirGucu;
    }
}

/**
 * Araba sınıfı, araba nesnelerini temsil eder.
 */
public class Araba {

    private String marka;
    private String model;
    private int yil;

    /**
     * Araba sınıfı için kurucu method.
     * @param marka arabanın markası
     * @param model arabanın modeli
     * @param yil arabanın üretim yılı
     */
    public Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
// Markayı alır
    /**
     * Arabanın markasını döndüren method.
     * @return arabanın markası
     */
    public String getMarka() {
        return marka;
    }
// Modeli alır
    /**
     * Arabanın modelini döndüren method.
     * @return arabanın modeli
     */
    public String getModel() {
        return model;
    }

    /**
     * Arabanın üretim yılını döndüren method.
     * @return arabanın üretim yılı
     */
    public int getYil() {
        return yil;
    }
}
/**
 * Araba sınıfı, bir arabanın özelliklerini ve davranışlarını temsil eder.
 */
 /**
     * Arabanın çalıştığını simüle eder.
     */

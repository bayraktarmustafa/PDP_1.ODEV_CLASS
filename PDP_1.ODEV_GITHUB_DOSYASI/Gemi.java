/**
 * Gemi sınıfı, gemi nesnelerini temsil eder.
 */
public class Gemi {

    private String isim;
    private double uzunluk;
    private int yolcuKapasitesi;

    /**
     * Gemi sınıfı için kurucu method.
     * @param isim geminin ismi
     * @param uzunluk geminin uzunluğu
     * @param yolcuKapasitesi geminin yolcu kapasitesi
     */
    public Gemi(String isim, double uzunluk, int yolcuKapasitesi) {
        this.isim = isim;
        this.uzunluk = uzunluk;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    /**
     * Geminin ismini döndüren method.
     * @return geminin ismi
     */
    public String getIsim() {
        return isim;
    }

    /**
     * Geminin uzunluğunu döndüren method.
     * @return geminin uzunluğu
     */
    public double getUzunluk() {
        return uzunluk;
    }

    /**
     * Geminin yolcu kapasitesini döndüren method.
     * @return geminin yolcu kapasitesi
     */
    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }
}

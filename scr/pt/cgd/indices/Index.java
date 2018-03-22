package pt.cgd.indices;

public class Index {

    private String sIndex;
    private double dPriceBought;
    private double dPriceLast;
    private double dPERation;
    private double dCurrentRatio;
    private double dDividendY;
    private double dDCF;
    private double dROE;
    private double dROI;
    private double dEBTIDA;

    public Index(String sIndex, double dPriceBought, double dPriceLast) {
        this.sIndex = sIndex;
        this.dPriceBought = dPriceBought;
        this.dPriceLast = dPriceLast;
    }

    public double calculateGains() {
        return (dPriceLast / dPriceBought - 1) * 100;
    }

    void setdPriceBought(double dPriceBought) {
        this.dPriceBought = dPriceBought;
    }

    double getdPriceBought() {
        return dPriceBought;
    }

    double getdPriceLast() {
        return dPriceLast;
    }

    double getdPERation() {
        return dPERation;
    }

    double getdCurrentRatio() {
        return dCurrentRatio;
    }

    double getdDividendY() {
        return dDividendY;
    }

    double getdDCF() {
        return dDCF;
    }

    double getdROE() {
        return dROE;
    }

    double getdROI() {
        return dROI;
    }

    double getdEBTIDA() {
        return dEBTIDA;
    }
    
}

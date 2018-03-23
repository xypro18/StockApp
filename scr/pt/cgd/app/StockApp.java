package pt.cgd.app;

import pt.cgd.indices.Index;

class StockApp {

    public static void main(String[] ss) {
        Index ind0 = new Index("AAPL", 175, 150);
        ind0.setoFinantial(1.2, 0.05, 3);

        double dGain = ind0.calculateGains();

//        IndexDownload indD0 = new IndexDownload("AAPL", IndexDownload.iYAHOO);
    }

}

package pt.cgd.app;

import pt.cgd.indices.Index;
import pt.cgd.indices.IndexDownload;

class StockApp {

    public static void main(String[] ss) throws Exception {

        Index[] ind = new Index[5];

        ind[0] = new Index("AAPL", 175, 150);
        ind[0].setoFinantial(1.2, 0.05, 3);

        double dGain = ind[0].calculateGains();

        IndexDownload indD0 = new IndexDownload("AAPL", IndexDownload.iALPHAVANTAGE);
    }

}

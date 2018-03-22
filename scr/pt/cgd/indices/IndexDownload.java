package pt.cgd.indices;

public class IndexDownload {

    final static int iALPHAVANTAGE = 0;
    final static int iYAHOO = 1;

    private final static String[] sURL = {
        "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=1min&apikey=demo",
        "http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote?format=json"
    };

    private String sIndex;
    private int iSite;
    private String sJSON;

    IndexDownload(String sIndex, int iSite) {
        this.sIndex = sIndex;
        this.iSite = iSite;

        switch (iSite) {
            case iALPHAVANTAGE:

                break;

            case iYAHOO:

                break;
        }

    }

}

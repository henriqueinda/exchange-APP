public class CoinAPI {
    private double BRL = 0;
    private double ARS = 0;
    private double USD = 0;
    private double CLP = 0;

    public CoinAPI(Coin coinRecord) {
        this.BRL = coinRecord.conversion_rates().BRL;
        this.ARS = coinRecord.conversion_rates().ARS;
        this.USD = coinRecord.conversion_rates().USD;
        this.CLP = coinRecord.conversion_rates().CLP;
    }

    public double returnCoin(String coinB) {
        if (coinB.equalsIgnoreCase("BRL")) {
            return this.BRL;
        } else if (coinB.equalsIgnoreCase("ARS")) {
            return this.ARS;
        } else if (coinB.equalsIgnoreCase("USD")) {
            return this.USD;
        } else {
            return this.CLP;
        }
    }

    @Override
    public String toString() {
        return "BRL = " + BRL +
                "\nARS = " + ARS +
                "\nUSD = " + USD +
                "\nCLP = " + CLP;
    }
}

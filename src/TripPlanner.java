public class TripPlanner {
    private String country;
    private String currency;
    private double exchangeRate;

    public TripPlanner(String country, String currency, double exchangeRate) {
        this.country = country;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof TripPlanner))
            return false;
        TripPlanner trip = (TripPlanner) obj;
        if (country == null) {
            if (trip.country != null)
                return false;
        } else if (!country.equals(trip.country))
            return false;

        if (currency == null) {
            if (trip.currency != null)
                return false;
        } else if (!currency.equals(trip.currency))
            return false;

        if (exchangeRate == 0) {
            if (trip.exchangeRate != 0)
                return false;
        } else if (exchangeRate != trip.exchangeRate) ;

        return true;

    }
}


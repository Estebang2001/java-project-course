package modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ExchangeRateResponse {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Double getConversionRates(String s) {
        return conversionRates.get(s);
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }
}
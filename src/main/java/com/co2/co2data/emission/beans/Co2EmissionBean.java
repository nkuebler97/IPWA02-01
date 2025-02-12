package com.co2.co2data.emission.beans;

import com.co2.co2data.emission.dao.Co2EmissionDAO;
import com.co2.co2data.emission.entities.Co2Emission;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class Co2EmissionBean implements Serializable {

    @Inject
    private Co2EmissionDAO co2EmissionDAO;
    private String selectedCountry;
    private int selectedYear;
    private Co2Emission co2Emission;
    private List<String> countries=new ArrayList<String>();

    public Co2EmissionBean() {
    }
    @PostConstruct
    public void init() {

        countries = co2EmissionDAO.findAllCountries();


    }
    public void fetchCo2EmissionData() {
        co2Emission = co2EmissionDAO.findByCountryAndYear(selectedCountry, selectedYear);
    }
    public List<String> getCountries() {
        return countries;
    }
    public String getSelectedCountry() {
        return selectedCountry;
    }
    public void setSelectedCountry(String selectedCountry) {
        this.selectedCountry = selectedCountry;
    }
    public int getSelectedYear() {
        return selectedYear;
    }
    public void setSelectedYear(int selectedYear) {
        this.selectedYear = selectedYear;
    }
    public Co2Emission getCo2Emission() {
        return co2Emission;
    }
    public void setCo2Emission(Co2Emission co2Emission) {
        this.co2Emission = co2Emission;
    }
}

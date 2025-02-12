package com.co2.co2data.emission.beans;

import com.co2.co2data.emission.dao.Co2EmissionDAO;
import com.co2.co2data.emission.entities.Co2Emission;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class AddCo2DataBean implements Serializable {
    private Co2Emission co2Emission=new Co2Emission();

    @Inject
    private Co2EmissionDAO dao;
    public String  addData()
    {
      dao.save(co2Emission);
      co2Emission=new Co2Emission();
          return "addData?faces-redirect=true";

    }

    public Co2Emission getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Co2Emission co2Emission) {
        this.co2Emission = co2Emission;
    }
}

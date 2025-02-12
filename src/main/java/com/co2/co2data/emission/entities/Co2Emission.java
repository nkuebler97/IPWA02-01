package com.co2.co2data.emission.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "co2_emission")
public class Co2Emission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "country")
    private String country;

    @Column(name = "year")
    private Integer year;

    @Size(max = 10)
    @Column(name = "iso_code", length = 10)
    private String isoCode;

    @Column(name = "population")
    private Long population;

    @Column(name = "gdp", precision = 20, scale = 2)
    private BigDecimal gdp;

    @Column(name = "cement_co2", precision = 20, scale = 2)
    private BigDecimal cementCo2;

    @Column(name = "cement_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal cementCo2PerCapita;

    @Column(name = "co2", precision = 20, scale = 2)
    private BigDecimal co2;

    @Column(name = "co2_growth_abs", precision = 20, scale = 2)
    private BigDecimal co2GrowthAbs;

    @Column(name = "co2_growth_prct", precision = 10, scale = 5)
    private BigDecimal co2GrowthPrct;

    @Column(name = "co2_including_luc", precision = 20, scale = 2)
    private BigDecimal co2IncludingLuc;

    @Column(name = "co2_including_luc_growth_abs", precision = 20, scale = 2)
    private BigDecimal co2IncludingLucGrowthAbs;

    @Column(name = "co2_including_luc_growth_prct", precision = 10, scale = 5)
    private BigDecimal co2IncludingLucGrowthPrct;

    @Column(name = "co2_including_luc_per_capita", precision = 20, scale = 5)
    private BigDecimal co2IncludingLucPerCapita;

    @Column(name = "co2_including_luc_per_gdp", precision = 20, scale = 5)
    private BigDecimal co2IncludingLucPerGdp;

    @Column(name = "co2_including_luc_per_unit_energy", precision = 20, scale = 5)
    private BigDecimal co2IncludingLucPerUnitEnergy;

    @Column(name = "co2_per_capita", precision = 20, scale = 5)
    private BigDecimal co2PerCapita;

    @Column(name = "co2_per_gdp", precision = 20, scale = 5)
    private BigDecimal co2PerGdp;

    @Column(name = "co2_per_unit_energy", precision = 20, scale = 5)
    private BigDecimal co2PerUnitEnergy;

    @Column(name = "coal_co2", precision = 20, scale = 2)
    private BigDecimal coalCo2;

    @Column(name = "coal_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal coalCo2PerCapita;

    @Column(name = "consumption_co2", precision = 20, scale = 2)
    private BigDecimal consumptionCo2;

    @Column(name = "consumption_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal consumptionCo2PerCapita;

    @Column(name = "consumption_co2_per_gdp", precision = 20, scale = 5)
    private BigDecimal consumptionCo2PerGdp;

    @Column(name = "cumulative_cement_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeCementCo2;

    @Column(name = "cumulative_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeCo2;

    @Column(name = "cumulative_co2_including_luc", precision = 20, scale = 2)
    private BigDecimal cumulativeCo2IncludingLuc;

    @Column(name = "cumulative_coal_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeCoalCo2;

    @Column(name = "cumulative_flaring_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeFlaringCo2;

    @Column(name = "cumulative_gas_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeGasCo2;

    @Column(name = "cumulative_luc_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeLucCo2;

    @Column(name = "cumulative_oil_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeOilCo2;

    @Column(name = "cumulative_other_co2", precision = 20, scale = 2)
    private BigDecimal cumulativeOtherCo2;

    @Column(name = "energy_per_capita", precision = 20, scale = 5)
    private BigDecimal energyPerCapita;

    @Column(name = "energy_per_gdp", precision = 20, scale = 5)
    private BigDecimal energyPerGdp;

    @Column(name = "flaring_co2", precision = 20, scale = 2)
    private BigDecimal flaringCo2;

    @Column(name = "flaring_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal flaringCo2PerCapita;

    @Column(name = "gas_co2", precision = 20, scale = 2)
    private BigDecimal gasCo2;

    @Column(name = "gas_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal gasCo2PerCapita;

    @Column(name = "ghg_excluding_lucf_per_capita", precision = 20, scale = 5)
    private BigDecimal ghgExcludingLucfPerCapita;

    @Column(name = "ghg_per_capita", precision = 20, scale = 5)
    private BigDecimal ghgPerCapita;

    @Column(name = "land_use_change_co2", precision = 20, scale = 2)
    private BigDecimal landUseChangeCo2;

    @Column(name = "land_use_change_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal landUseChangeCo2PerCapita;

    @Column(name = "methane", precision = 20, scale = 2)
    private BigDecimal methane;

    @Column(name = "methane_per_capita", precision = 20, scale = 5)
    private BigDecimal methanePerCapita;

    @Column(name = "nitrous_oxide", precision = 20, scale = 2)
    private BigDecimal nitrousOxide;

    @Column(name = "nitrous_oxide_per_capita", precision = 20, scale = 5)
    private BigDecimal nitrousOxidePerCapita;

    @Column(name = "oil_co2", precision = 20, scale = 2)
    private BigDecimal oilCo2;

    @Column(name = "oil_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal oilCo2PerCapita;

    @Column(name = "other_co2_per_capita", precision = 20, scale = 5)
    private BigDecimal otherCo2PerCapita;

    @Column(name = "other_industry_co2", precision = 20, scale = 2)
    private BigDecimal otherIndustryCo2;

    @Column(name = "primary_energy_consumption", precision = 20, scale = 2)
    private BigDecimal primaryEnergyConsumption;

    @Column(name = "share_global_cement_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCementCo2;

    @Column(name = "share_global_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCo2;

    @Column(name = "share_global_co2_including_luc", precision = 10, scale = 5)
    private BigDecimal shareGlobalCo2IncludingLuc;

    @Column(name = "share_global_coal_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCoalCo2;

    @Column(name = "share_global_cumulative_cement_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeCementCo2;

    @Column(name = "share_global_cumulative_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeCo2;

    @Column(name = "share_global_cumulative_co2_including_luc", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeCo2IncludingLuc;

    @Column(name = "share_global_cumulative_coal_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeCoalCo2;

    @Column(name = "share_global_cumulative_flaring_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeFlaringCo2;

    @Column(name = "share_global_cumulative_gas_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeGasCo2;

    @Column(name = "share_global_cumulative_luc_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeLucCo2;

    @Column(name = "share_global_cumulative_oil_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeOilCo2;

    @Column(name = "share_global_cumulative_other_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalCumulativeOtherCo2;

    @Column(name = "share_global_flaring_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalFlaringCo2;

    @Column(name = "share_global_gas_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalGasCo2;

    @Column(name = "share_global_luc_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalLucCo2;

    @Column(name = "share_global_oil_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalOilCo2;

    @Column(name = "share_global_other_co2", precision = 10, scale = 5)
    private BigDecimal shareGlobalOtherCo2;

    @Column(name = "share_of_temperature_change_from_ghg", precision = 10, scale = 5)
    private BigDecimal shareOfTemperatureChangeFromGhg;

    @Column(name = "temperature_change_from_ch4", precision = 10, scale = 5)
    private BigDecimal temperatureChangeFromCh4;

    @Column(name = "temperature_change_from_co2", precision = 10, scale = 5)
    private BigDecimal temperatureChangeFromCo2;

    @Column(name = "temperature_change_from_ghg", precision = 10, scale = 5)
    private BigDecimal temperatureChangeFromGhg;

    @Column(name = "temperature_change_from_n2o", precision = 10, scale = 5)
    private BigDecimal temperatureChangeFromN2o;

    @Column(name = "total_ghg", precision = 20, scale = 2)
    private BigDecimal totalGhg;

    @Column(name = "total_ghg_excluding_lucf", precision = 20, scale = 2)
    private BigDecimal totalGhgExcludingLucf;

    @Column(name = "trade_co2", precision = 20, scale = 2)
    private BigDecimal tradeCo2;

    @Column(name = "trade_co2_share", precision = 10, scale = 5)
    private BigDecimal tradeCo2Share;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }

    public BigDecimal getCementCo2() {
        return cementCo2;
    }

    public void setCementCo2(BigDecimal cementCo2) {
        this.cementCo2 = cementCo2;
    }

    public BigDecimal getCementCo2PerCapita() {
        return cementCo2PerCapita;
    }

    public void setCementCo2PerCapita(BigDecimal cementCo2PerCapita) {
        this.cementCo2PerCapita = cementCo2PerCapita;
    }

    public BigDecimal getCo2() {
        return co2;
    }

    public void setCo2(BigDecimal co2) {
        this.co2 = co2;
    }

    public BigDecimal getCo2GrowthAbs() {
        return co2GrowthAbs;
    }

    public void setCo2GrowthAbs(BigDecimal co2GrowthAbs) {
        this.co2GrowthAbs = co2GrowthAbs;
    }

    public BigDecimal getCo2GrowthPrct() {
        return co2GrowthPrct;
    }

    public void setCo2GrowthPrct(BigDecimal co2GrowthPrct) {
        this.co2GrowthPrct = co2GrowthPrct;
    }

    public BigDecimal getCo2IncludingLuc() {
        return co2IncludingLuc;
    }

    public void setCo2IncludingLuc(BigDecimal co2IncludingLuc) {
        this.co2IncludingLuc = co2IncludingLuc;
    }

    public BigDecimal getCo2IncludingLucGrowthAbs() {
        return co2IncludingLucGrowthAbs;
    }

    public void setCo2IncludingLucGrowthAbs(BigDecimal co2IncludingLucGrowthAbs) {
        this.co2IncludingLucGrowthAbs = co2IncludingLucGrowthAbs;
    }

    public BigDecimal getCo2IncludingLucGrowthPrct() {
        return co2IncludingLucGrowthPrct;
    }

    public void setCo2IncludingLucGrowthPrct(BigDecimal co2IncludingLucGrowthPrct) {
        this.co2IncludingLucGrowthPrct = co2IncludingLucGrowthPrct;
    }

    public BigDecimal getCo2IncludingLucPerCapita() {
        return co2IncludingLucPerCapita;
    }

    public void setCo2IncludingLucPerCapita(BigDecimal co2IncludingLucPerCapita) {
        this.co2IncludingLucPerCapita = co2IncludingLucPerCapita;
    }

    public BigDecimal getCo2IncludingLucPerGdp() {
        return co2IncludingLucPerGdp;
    }

    public void setCo2IncludingLucPerGdp(BigDecimal co2IncludingLucPerGdp) {
        this.co2IncludingLucPerGdp = co2IncludingLucPerGdp;
    }

    public BigDecimal getCo2IncludingLucPerUnitEnergy() {
        return co2IncludingLucPerUnitEnergy;
    }

    public void setCo2IncludingLucPerUnitEnergy(BigDecimal co2IncludingLucPerUnitEnergy) {
        this.co2IncludingLucPerUnitEnergy = co2IncludingLucPerUnitEnergy;
    }

    public BigDecimal getCo2PerCapita() {
        return co2PerCapita;
    }

    public void setCo2PerCapita(BigDecimal co2PerCapita) {
        this.co2PerCapita = co2PerCapita;
    }

    public BigDecimal getCo2PerGdp() {
        return co2PerGdp;
    }

    public void setCo2PerGdp(BigDecimal co2PerGdp) {
        this.co2PerGdp = co2PerGdp;
    }

    public BigDecimal getCo2PerUnitEnergy() {
        return co2PerUnitEnergy;
    }

    public void setCo2PerUnitEnergy(BigDecimal co2PerUnitEnergy) {
        this.co2PerUnitEnergy = co2PerUnitEnergy;
    }

    public BigDecimal getCoalCo2() {
        return coalCo2;
    }

    public void setCoalCo2(BigDecimal coalCo2) {
        this.coalCo2 = coalCo2;
    }

    public BigDecimal getCoalCo2PerCapita() {
        return coalCo2PerCapita;
    }

    public void setCoalCo2PerCapita(BigDecimal coalCo2PerCapita) {
        this.coalCo2PerCapita = coalCo2PerCapita;
    }

    public BigDecimal getConsumptionCo2() {
        return consumptionCo2;
    }

    public void setConsumptionCo2(BigDecimal consumptionCo2) {
        this.consumptionCo2 = consumptionCo2;
    }

    public BigDecimal getConsumptionCo2PerCapita() {
        return consumptionCo2PerCapita;
    }

    public void setConsumptionCo2PerCapita(BigDecimal consumptionCo2PerCapita) {
        this.consumptionCo2PerCapita = consumptionCo2PerCapita;
    }

    public BigDecimal getConsumptionCo2PerGdp() {
        return consumptionCo2PerGdp;
    }

    public void setConsumptionCo2PerGdp(BigDecimal consumptionCo2PerGdp) {
        this.consumptionCo2PerGdp = consumptionCo2PerGdp;
    }

    public BigDecimal getCumulativeCementCo2() {
        return cumulativeCementCo2;
    }

    public void setCumulativeCementCo2(BigDecimal cumulativeCementCo2) {
        this.cumulativeCementCo2 = cumulativeCementCo2;
    }

    public BigDecimal getCumulativeCo2() {
        return cumulativeCo2;
    }

    public void setCumulativeCo2(BigDecimal cumulativeCo2) {
        this.cumulativeCo2 = cumulativeCo2;
    }

    public BigDecimal getCumulativeCo2IncludingLuc() {
        return cumulativeCo2IncludingLuc;
    }

    public void setCumulativeCo2IncludingLuc(BigDecimal cumulativeCo2IncludingLuc) {
        this.cumulativeCo2IncludingLuc = cumulativeCo2IncludingLuc;
    }

    public BigDecimal getCumulativeCoalCo2() {
        return cumulativeCoalCo2;
    }

    public void setCumulativeCoalCo2(BigDecimal cumulativeCoalCo2) {
        this.cumulativeCoalCo2 = cumulativeCoalCo2;
    }

    public BigDecimal getCumulativeFlaringCo2() {
        return cumulativeFlaringCo2;
    }

    public void setCumulativeFlaringCo2(BigDecimal cumulativeFlaringCo2) {
        this.cumulativeFlaringCo2 = cumulativeFlaringCo2;
    }

    public BigDecimal getCumulativeGasCo2() {
        return cumulativeGasCo2;
    }

    public void setCumulativeGasCo2(BigDecimal cumulativeGasCo2) {
        this.cumulativeGasCo2 = cumulativeGasCo2;
    }

    public BigDecimal getCumulativeLucCo2() {
        return cumulativeLucCo2;
    }

    public void setCumulativeLucCo2(BigDecimal cumulativeLucCo2) {
        this.cumulativeLucCo2 = cumulativeLucCo2;
    }

    public BigDecimal getCumulativeOilCo2() {
        return cumulativeOilCo2;
    }

    public void setCumulativeOilCo2(BigDecimal cumulativeOilCo2) {
        this.cumulativeOilCo2 = cumulativeOilCo2;
    }

    public BigDecimal getCumulativeOtherCo2() {
        return cumulativeOtherCo2;
    }

    public void setCumulativeOtherCo2(BigDecimal cumulativeOtherCo2) {
        this.cumulativeOtherCo2 = cumulativeOtherCo2;
    }

    public BigDecimal getEnergyPerCapita() {
        return energyPerCapita;
    }

    public void setEnergyPerCapita(BigDecimal energyPerCapita) {
        this.energyPerCapita = energyPerCapita;
    }

    public BigDecimal getEnergyPerGdp() {
        return energyPerGdp;
    }

    public void setEnergyPerGdp(BigDecimal energyPerGdp) {
        this.energyPerGdp = energyPerGdp;
    }

    public BigDecimal getFlaringCo2() {
        return flaringCo2;
    }

    public void setFlaringCo2(BigDecimal flaringCo2) {
        this.flaringCo2 = flaringCo2;
    }

    public BigDecimal getFlaringCo2PerCapita() {
        return flaringCo2PerCapita;
    }

    public void setFlaringCo2PerCapita(BigDecimal flaringCo2PerCapita) {
        this.flaringCo2PerCapita = flaringCo2PerCapita;
    }

    public BigDecimal getGasCo2() {
        return gasCo2;
    }

    public void setGasCo2(BigDecimal gasCo2) {
        this.gasCo2 = gasCo2;
    }

    public BigDecimal getGasCo2PerCapita() {
        return gasCo2PerCapita;
    }

    public void setGasCo2PerCapita(BigDecimal gasCo2PerCapita) {
        this.gasCo2PerCapita = gasCo2PerCapita;
    }

    public BigDecimal getGhgExcludingLucfPerCapita() {
        return ghgExcludingLucfPerCapita;
    }

    public void setGhgExcludingLucfPerCapita(BigDecimal ghgExcludingLucfPerCapita) {
        this.ghgExcludingLucfPerCapita = ghgExcludingLucfPerCapita;
    }

    public BigDecimal getGhgPerCapita() {
        return ghgPerCapita;
    }

    public void setGhgPerCapita(BigDecimal ghgPerCapita) {
        this.ghgPerCapita = ghgPerCapita;
    }

    public BigDecimal getLandUseChangeCo2() {
        return landUseChangeCo2;
    }

    public void setLandUseChangeCo2(BigDecimal landUseChangeCo2) {
        this.landUseChangeCo2 = landUseChangeCo2;
    }

    public BigDecimal getLandUseChangeCo2PerCapita() {
        return landUseChangeCo2PerCapita;
    }

    public void setLandUseChangeCo2PerCapita(BigDecimal landUseChangeCo2PerCapita) {
        this.landUseChangeCo2PerCapita = landUseChangeCo2PerCapita;
    }
    public BigDecimal getMethane() {
        return methane;
    }

    public void setMethane(BigDecimal methane) {
        this.methane = methane;
    }

    public BigDecimal getMethanePerCapita() {
        return methanePerCapita;
    }

    public void setMethanePerCapita(BigDecimal methanePerCapita) {
        this.methanePerCapita = methanePerCapita;
    }

    public BigDecimal getNitrousOxide() {
        return nitrousOxide;
    }

    public void setNitrousOxide(BigDecimal nitrousOxide) {
        this.nitrousOxide = nitrousOxide;
    }

    public BigDecimal getNitrousOxidePerCapita() {
        return nitrousOxidePerCapita;
    }

    public void setNitrousOxidePerCapita(BigDecimal nitrousOxidePerCapita) {
        this.nitrousOxidePerCapita = nitrousOxidePerCapita;
    }

    public BigDecimal getOilCo2() {
        return oilCo2;
    }

    public void setOilCo2(BigDecimal oilCo2) {
        this.oilCo2 = oilCo2;
    }

    public BigDecimal getOilCo2PerCapita() {
        return oilCo2PerCapita;
    }

    public void setOilCo2PerCapita(BigDecimal oilCo2PerCapita) {
        this.oilCo2PerCapita = oilCo2PerCapita;
    }

    public BigDecimal getOtherCo2PerCapita() {
        return otherCo2PerCapita;
    }

    public void setOtherCo2PerCapita(BigDecimal otherCo2PerCapita) {
        this.otherCo2PerCapita = otherCo2PerCapita;
    }

    public BigDecimal getOtherIndustryCo2() {
        return otherIndustryCo2;
    }

    public void setOtherIndustryCo2(BigDecimal otherIndustryCo2) {
        this.otherIndustryCo2 = otherIndustryCo2;
    }

    public BigDecimal getPrimaryEnergyConsumption() {
        return primaryEnergyConsumption;
    }

    public void setPrimaryEnergyConsumption(BigDecimal primaryEnergyConsumption) {
        this.primaryEnergyConsumption = primaryEnergyConsumption;
    }

    public BigDecimal getShareGlobalCementCo2() {
        return shareGlobalCementCo2;
    }

    public void setShareGlobalCementCo2(BigDecimal shareGlobalCementCo2) {
        this.shareGlobalCementCo2 = shareGlobalCementCo2;
    }

    public BigDecimal getShareGlobalCo2() {
        return shareGlobalCo2;
    }

    public void setShareGlobalCo2(BigDecimal shareGlobalCo2) {
        this.shareGlobalCo2 = shareGlobalCo2;
    }

    public BigDecimal getShareGlobalCo2IncludingLuc() {
        return shareGlobalCo2IncludingLuc;
    }

    public void setShareGlobalCo2IncludingLuc(BigDecimal shareGlobalCo2IncludingLuc) {
        this.shareGlobalCo2IncludingLuc = shareGlobalCo2IncludingLuc;
    }

    public BigDecimal getShareGlobalCoalCo2() {
        return shareGlobalCoalCo2;
    }

    public void setShareGlobalCoalCo2(BigDecimal shareGlobalCoalCo2) {
        this.shareGlobalCoalCo2 = shareGlobalCoalCo2;
    }

    public BigDecimal getShareGlobalCumulativeCementCo2() {
        return shareGlobalCumulativeCementCo2;
    }

    public void setShareGlobalCumulativeCementCo2(BigDecimal shareGlobalCumulativeCementCo2) {
        this.shareGlobalCumulativeCementCo2 = shareGlobalCumulativeCementCo2;
    }

    public BigDecimal getShareGlobalCumulativeCo2() {
        return shareGlobalCumulativeCo2;
    }

    public void setShareGlobalCumulativeCo2(BigDecimal shareGlobalCumulativeCo2) {
        this.shareGlobalCumulativeCo2 = shareGlobalCumulativeCo2;
    }

    public BigDecimal getShareGlobalCumulativeCo2IncludingLuc() {
        return shareGlobalCumulativeCo2IncludingLuc;
    }

    public void setShareGlobalCumulativeCo2IncludingLuc(BigDecimal shareGlobalCumulativeCo2IncludingLuc) {
        this.shareGlobalCumulativeCo2IncludingLuc = shareGlobalCumulativeCo2IncludingLuc;
    }

    public BigDecimal getShareGlobalCumulativeCoalCo2() {
        return shareGlobalCumulativeCoalCo2;
    }

    public void setShareGlobalCumulativeCoalCo2(BigDecimal shareGlobalCumulativeCoalCo2) {
        this.shareGlobalCumulativeCoalCo2 = shareGlobalCumulativeCoalCo2;
    }

    public BigDecimal getShareGlobalCumulativeFlaringCo2() {
        return shareGlobalCumulativeFlaringCo2;
    }

    public void setShareGlobalCumulativeFlaringCo2(BigDecimal shareGlobalCumulativeFlaringCo2) {
        this.shareGlobalCumulativeFlaringCo2 = shareGlobalCumulativeFlaringCo2;
    }

    public BigDecimal getShareGlobalCumulativeGasCo2() {
        return shareGlobalCumulativeGasCo2;
    }

    public void setShareGlobalCumulativeGasCo2(BigDecimal shareGlobalCumulativeGasCo2) {
        this.shareGlobalCumulativeGasCo2 = shareGlobalCumulativeGasCo2;
    }

    public BigDecimal getShareGlobalCumulativeLucCo2() {
        return shareGlobalCumulativeLucCo2;
    }

    public void setShareGlobalCumulativeLucCo2(BigDecimal shareGlobalCumulativeLucCo2) {
        this.shareGlobalCumulativeLucCo2 = shareGlobalCumulativeLucCo2;
    }

    public BigDecimal getShareGlobalCumulativeOilCo2() {
        return shareGlobalCumulativeOilCo2;
    }

    public void setShareGlobalCumulativeOilCo2(BigDecimal shareGlobalCumulativeOilCo2) {
        this.shareGlobalCumulativeOilCo2 = shareGlobalCumulativeOilCo2;
    }

    public BigDecimal getShareGlobalCumulativeOtherCo2() {
        return shareGlobalCumulativeOtherCo2;
    }

    public void setShareGlobalCumulativeOtherCo2(BigDecimal shareGlobalCumulativeOtherCo2) {
        this.shareGlobalCumulativeOtherCo2 = shareGlobalCumulativeOtherCo2;
    }

    public BigDecimal getShareGlobalFlaringCo2() {
        return shareGlobalFlaringCo2;
    }

    public void setShareGlobalFlaringCo2(BigDecimal shareGlobalFlaringCo2) {
        this.shareGlobalFlaringCo2 = shareGlobalFlaringCo2;
    }

    public BigDecimal getShareGlobalGasCo2() {
        return shareGlobalGasCo2;
    }

    public void setShareGlobalGasCo2(BigDecimal shareGlobalGasCo2) {
        this.shareGlobalGasCo2 = shareGlobalGasCo2;
    }

    public BigDecimal getShareGlobalLucCo2() {
        return shareGlobalLucCo2;
    }

    public void setShareGlobalLucCo2(BigDecimal shareGlobalLucCo2) {
        this.shareGlobalLucCo2 = shareGlobalLucCo2;
    }

    public BigDecimal getShareGlobalOilCo2() {
        return shareGlobalOilCo2;
    }

    public void setShareGlobalOilCo2(BigDecimal shareGlobalOilCo2) {
        this.shareGlobalOilCo2 = shareGlobalOilCo2;
    }

    public BigDecimal getShareGlobalOtherCo2() {
        return shareGlobalOtherCo2;
    }

    public void setShareGlobalOtherCo2(BigDecimal shareGlobalOtherCo2) {
        this.shareGlobalOtherCo2 = shareGlobalOtherCo2;
    }

    public BigDecimal getShareOfTemperatureChangeFromGhg() {
        return shareOfTemperatureChangeFromGhg;
    }

    public void setShareOfTemperatureChangeFromGhg(BigDecimal shareOfTemperatureChangeFromGhg) {
        this.shareOfTemperatureChangeFromGhg = shareOfTemperatureChangeFromGhg;
    }

    public BigDecimal getTemperatureChangeFromCh4() {
        return temperatureChangeFromCh4;
    }

    public void setTemperatureChangeFromCh4(BigDecimal temperatureChangeFromCh4) {
        this.temperatureChangeFromCh4 = temperatureChangeFromCh4;
    }

    public BigDecimal getTemperatureChangeFromCo2() {
        return temperatureChangeFromCo2;
    }

    public void setTemperatureChangeFromCo2(BigDecimal temperatureChangeFromCo2) {
        this.temperatureChangeFromCo2 = temperatureChangeFromCo2;
    }

    public BigDecimal getTemperatureChangeFromGhg() {
        return temperatureChangeFromGhg;
    }

    public void setTemperatureChangeFromGhg(BigDecimal temperatureChangeFromGhg) {
        this.temperatureChangeFromGhg = temperatureChangeFromGhg;
    }

    public BigDecimal getTemperatureChangeFromN2o() {
        return temperatureChangeFromN2o;
    }

    public void setTemperatureChangeFromN2o(BigDecimal temperatureChangeFromN2o) {
        this.temperatureChangeFromN2o = temperatureChangeFromN2o;
    }

    public BigDecimal getTotalGhg() {
        return totalGhg;
    }

    public void setTotalGhg(BigDecimal totalGhg) {
        this.totalGhg = totalGhg;
    }

    public BigDecimal getTotalGhgExcludingLucf() {
        return totalGhgExcludingLucf;
    }

    public void setTotalGhgExcludingLucf(BigDecimal totalGhgExcludingLucf) {
        this.totalGhgExcludingLucf = totalGhgExcludingLucf;
    }

    public BigDecimal getTradeCo2() {
        return tradeCo2;
    }

    public void setTradeCo2(BigDecimal tradeCo2) {
        this.tradeCo2 = tradeCo2;
    }

    public BigDecimal getTradeCo2Share() {
        return tradeCo2Share;
    }

    public void setTradeCo2Share(BigDecimal tradeCo2Share) {
        this.tradeCo2Share = tradeCo2Share;
    }

    @Override
    public String toString() {
        return
                "country='" + country + "'\t" +
                        "year=" + year + "\t" +
                        "isoCode='" + isoCode + "'\t" +
                        "population=" + population + "\t" +
                        "gdp=" + gdp + "\t" +
                        "cementCo2=" + cementCo2 + "\t" +
                        "cementCo2PerCapita=" + cementCo2PerCapita + "\t" +
                        "co2=" + co2 + "\t" +
                        "co2GrowthAbs=" + co2GrowthAbs + "\t" +
                        "co2GrowthPrct=" + co2GrowthPrct + "\t" +
                        "co2IncludingLuc=" + co2IncludingLuc + "\t" +
                        "co2IncludingLucGrowthAbs=" + co2IncludingLucGrowthAbs + "\t" +
                        "co2IncludingLucGrowthPrct=" + co2IncludingLucGrowthPrct + "\t" +
                        "co2IncludingLucPerCapita=" + co2IncludingLucPerCapita + "\t" +
                        "co2IncludingLucPerGdp=" + co2IncludingLucPerGdp + "\t" +
                        "co2IncludingLucPerUnitEnergy=" + co2IncludingLucPerUnitEnergy + "\t" +
                        "co2PerCapita=" + co2PerCapita + "\t" +
                        "co2PerGdp=" + co2PerGdp + "\t" +
                        "co2PerUnitEnergy=" + co2PerUnitEnergy + "\t" +
                        "coalCo2=" + coalCo2 + "\t" +
                        "coalCo2PerCapita=" + coalCo2PerCapita + "\t" +
                        "consumptionCo2=" + consumptionCo2 + "\t" +
                        "consumptionCo2PerCapita=" + consumptionCo2PerCapita + "\t" +
                        "consumptionCo2PerGdp=" + consumptionCo2PerGdp + "\t" +
                        "cumulativeCementCo2=" + cumulativeCementCo2 + "\t" +
                        "cumulativeCo2=" + cumulativeCo2 + "\t" +
                        "cumulativeCo2IncludingLuc=" + cumulativeCo2IncludingLuc + "\t" +
                        "cumulativeCoalCo2=" + cumulativeCoalCo2 + "\t" +
                        "cumulativeFlaringCo2=" + cumulativeFlaringCo2 + "\t" +
                        "cumulativeGasCo2=" + cumulativeGasCo2 + "\t" +
                        "cumulativeLucCo2=" + cumulativeLucCo2 + "\t" +
                        "cumulativeOilCo2=" + cumulativeOilCo2 + "\t" +
                        "cumulativeOtherCo2=" + cumulativeOtherCo2 + "\t" +
                        "energyPerCapita=" + energyPerCapita + "\t" +
                        "energyPerGdp=" + energyPerGdp + "\t" +
                        "flaringCo2=" + flaringCo2 + "\t" +
                        "flaringCo2PerCapita=" + flaringCo2PerCapita + "\t" +
                        "gasCo2=" + gasCo2 + "\t" +
                        "gasCo2PerCapita=" + gasCo2PerCapita + "\t" +
                        "ghgExcludingLucfPerCapita=" + ghgExcludingLucfPerCapita + "\t" +
                        "ghgPerCapita=" + ghgPerCapita + "\t" +
                        "landUseChangeCo2=" + landUseChangeCo2 + "\t" +
                        "landUseChangeCo2PerCapita=" + landUseChangeCo2PerCapita + "\t" +
                        "methane=" + methane + "\t" +
                        "methanePerCapita=" + methanePerCapita + "\t" +
                        "nitrousOxide=" + nitrousOxide + "\t" +
                        "nitrousOxidePerCapita=" + nitrousOxidePerCapita + "\t" +
                        "oilCo2=" + oilCo2 + "\t" +
                        "oilCo2PerCapita=" + oilCo2PerCapita + "\t" +
                        "otherCo2PerCapita=" + otherCo2PerCapita + "\t" +
                        "otherIndustryCo2=" + otherIndustryCo2 + "\t" +
                        "primaryEnergyConsumption=" + primaryEnergyConsumption + "\t" +
                        "shareGlobalCementCo2=" + shareGlobalCementCo2 + "\t" +
                        "shareGlobalCo2=" + shareGlobalCo2 + "\t" +
                        "shareGlobalCo2IncludingLuc=" + shareGlobalCo2IncludingLuc + "\t" +
                        "shareGlobalCoalCo2=" + shareGlobalCoalCo2 + "\t" +
                        "shareGlobalCumulativeCementCo2=" + shareGlobalCumulativeCementCo2 + "\t" +
                        "shareGlobalCumulativeCo2=" + shareGlobalCumulativeCo2 + "\t" +
                        "shareGlobalCumulativeCo2IncludingLuc=" + shareGlobalCumulativeCo2IncludingLuc + "\t" +
                        "shareGlobalCumulativeCoalCo2=" + shareGlobalCumulativeCoalCo2 + "\t" +
                        "shareGlobalCumulativeFlaringCo2=" + shareGlobalCumulativeFlaringCo2 + "\t" +
                        "shareGlobalCumulativeGasCo2=" + shareGlobalCumulativeGasCo2 + "\t" +
                        "shareGlobalCumulativeLucCo2=" + shareGlobalCumulativeLucCo2 + "\t" +
                        "shareGlobalCumulativeOilCo2=" + shareGlobalCumulativeOilCo2 + "\t" +
                        "shareGlobalCumulativeOtherCo2=" + shareGlobalCumulativeOtherCo2 + "\t" +
                        "shareGlobalFlaringCo2=" + shareGlobalFlaringCo2 + "\t" +
                        "shareGlobalGasCo2=" + shareGlobalGasCo2 + "\t" +
                        "shareGlobalLucCo2=" + shareGlobalLucCo2 + "\t" +
                        "shareGlobalOilCo2=" + shareGlobalOilCo2 + "\t" +
                        "shareGlobalOtherCo2=" + shareGlobalOtherCo2 + "\t" +
                        "shareOfTemperatureChangeFromGhg=" + shareOfTemperatureChangeFromGhg + "\t" +
                        "temperatureChangeFromCh4=" + temperatureChangeFromCh4 + "\t" +
                        "temperatureChangeFromCo2=" + temperatureChangeFromCo2 + "\t" +
                        "temperatureChangeFromGhg=" + temperatureChangeFromGhg + "\t" +
                        "temperatureChangeFromN2o=" + temperatureChangeFromN2o + "\t" +
                        "totalGhg=" + totalGhg + "\t" +
                        "totalGhgExcludingLucf=" + totalGhgExcludingLucf + "\t" +
                        "tradeCo2=" + tradeCo2 + "\t" +
                        "tradeCo2Share=" + tradeCo2Share;
    }
}
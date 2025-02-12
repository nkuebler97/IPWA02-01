package com.co2.co2data.emission.dao;

import com.co2.co2data.emission.entities.Co2Emission;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class Co2EmissionDAO {

    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public Co2Emission findByCountryAndYear(String country, int year) {
        try {
            return entityManager.createQuery(
                            "SELECT c FROM Co2Emission c WHERE c.country = :country AND c.year = :year", Co2Emission.class)
                    .setParameter("country", country)
                    .setParameter("year", year)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Co2Emission> findByCountry(String country) {
        return entityManager.createQuery("SELECT c FROM Co2Emission c WHERE c.country = :country", Co2Emission.class)
                .setParameter("country", country)
                .getResultList();
    }

    public List<String> findAllCountries() {
        List<String> countryList = entityManager.createQuery(
                        "SELECT DISTINCT c.country FROM Co2Emission c WHERE c.country IS NOT NULL ORDER BY c.country",
                        String.class)
                .getResultList();
        return countryList;
    }

    @Transactional

    public void save(Co2Emission emission) {
        entityManager.createNativeQuery("INSERT INTO co2_emission (country, year, iso_code, population, co2,co2_growth_abs) VALUES (?, ?, ?, ?, ?,?)")
                .setParameter(1, emission.getCountry())
                .setParameter(2, emission.getYear())
                .setParameter(3, emission.getIsoCode())
                .setParameter(4, emission.getPopulation())
                .setParameter(5, emission.getCo2())
                .setParameter(6, emission.getCo2GrowthAbs())
                .executeUpdate();
    }

}

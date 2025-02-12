package com.co2.co2data.emission.dao;
import com.co2.co2data.emission.entities.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@ApplicationScoped
public class UserDAO {

    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public boolean login(String n, String p) {
        try {
            User user = entityManager.createQuery(
                            "SELECT u FROM User u WHERE u.username = :name AND u.password = :ps", User.class)
                    .setParameter("name", n)
                    .setParameter("ps", p)
                    .getSingleResult();
            return user != null ;
        }
        catch (Exception e) {
            return false;
        }

    }
}

package com.cds.miniproject.repository;

import com.cds.miniproject.model.Player;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PlayerRepositoryCustomImpl implements PlayerRepositoryCustom{
    @PersistenceContext private EntityManager em;

    @Override
    public List<Player> findAllValid() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Player> cq = cb.createQuery(Player.class);
        Root<Player> player = cq.from(Player.class);
        Predicate validStrength = cb.between(player.get("strength"), 0, 1000);
        Predicate validIntelligence = cb.between(player.get("intelligence"), 0, 1000);
        Predicate validDexterity = cb.between(player.get("dexterity"), 0, 1000);
        cq.where(validStrength, validIntelligence, validDexterity);
        TypedQuery<Player> query = em.createQuery(cq);
        return query.getResultList();
    }
}

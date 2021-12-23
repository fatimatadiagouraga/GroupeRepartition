package com.GroupeRepartition.demo.Apprenant.Repositories;

import com.GroupeRepartition.demo.Apprenant.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
    Optional<Apprenant> findByEmail(String email);
    Optional<Apprenant> findByTel(int tel);
}

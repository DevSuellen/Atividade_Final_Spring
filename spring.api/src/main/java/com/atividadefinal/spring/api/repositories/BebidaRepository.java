package com.atividadefinal.spring.api.repositories;

import com.atividadefinal.spring.api.models.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Long> {

}

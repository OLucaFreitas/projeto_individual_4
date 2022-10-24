package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Promocao;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Integer>{

}

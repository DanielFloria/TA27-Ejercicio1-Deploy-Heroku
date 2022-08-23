package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Long>{

}

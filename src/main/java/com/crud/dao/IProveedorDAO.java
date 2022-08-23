package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String>{

}

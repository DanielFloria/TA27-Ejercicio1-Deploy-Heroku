package com.crud.service;

import java.util.List;

import com.crud.dto.Suministra;

public interface ISuministraService {
	public Suministra guardarSuministra(Suministra suministra);
	
	public List<Suministra> listarSuministra();
	
	public Suministra suministraPorId(Long id);	
	
	public Suministra actualizarSuministra(Suministra suministra);	
	
	public void eliminarSuministra(Long id);
}

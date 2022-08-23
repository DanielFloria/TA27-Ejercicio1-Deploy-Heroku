package com.crud.service;

import java.util.List;

import com.crud.dto.Pieza;

public interface IPiezaService {
	
	public Pieza guardarPieza(Pieza pieza);
	
	public List<Pieza> listarPiezas();
	
	public Pieza piezaPorId(Long id);	
	
	public Pieza actualizarPieza(Pieza pieza);	
	
	public void eliminarPieza(Long id);
}
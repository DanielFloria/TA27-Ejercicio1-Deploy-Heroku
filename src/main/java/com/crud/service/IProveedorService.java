package com.crud.service;

import java.util.List;

import com.crud.dto.Proveedor;

public interface IProveedorService {
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public List<Proveedor> listarProveedores();
	
	public Proveedor proveedorPorId(String id);	
	
	public Proveedor actualizarProveedor(Proveedor proveedor);	
	
	public void eliminarProveedor(String id);
}

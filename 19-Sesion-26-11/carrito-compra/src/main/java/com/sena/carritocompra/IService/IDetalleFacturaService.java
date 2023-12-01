package com.sena.carritocompra.IService;

import java.util.List;
import java.util.Optional;

import com.sena.carritocompra.Entity.DetalleFactura;

public interface IDetalleFacturaService {	
	
	/**
	 * Método para consultar todo
	 * **/
	public List<DetalleFactura> findAll();
	
	/**
	 * Método para consultar por id
	 * **/
	public Optional<DetalleFactura> findById(Long id);
	
	
	/**
	 * Método para guardar
	 * **/
	public DetalleFactura save(DetalleFactura detallefactura);
	
	/**
	 * Método para modificar
	 * **/
	public void update(DetalleFactura detallefactura, Long id);
	
	/**
	 * Método para eliminar
	 * **/
	public void delete(Long id);
	
	/**
	 * Método para eliminar lógico
	 * **/
	public void deletedAt(Long id);
	
}

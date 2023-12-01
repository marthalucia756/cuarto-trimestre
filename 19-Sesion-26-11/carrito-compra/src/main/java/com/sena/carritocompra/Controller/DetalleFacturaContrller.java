package com.sena.carritocompra.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.carritocompra.Entity.DetalleFactura;
import com.sena.carritocompra.IService.IDetalleFacturaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping(".")
public class DetalleFacturaContrller {
	@Autowired
	private IDetalleFacturaService service;
	
	@GetMapping
	public List<DetalleFactura> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<DetalleFactura> findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public DetalleFactura save(@RequestBody DetalleFactura detallefactura) {
		return service.save(detallefactura);
	}
	
	@PutMapping("{id}")
	public void save(@RequestBody DetalleFactura detallefactura, @PathVariable  Long id) {
		service.update(detallefactura, id);
	}
	
	@PutMapping("deleted-at/{id}")
	public void deletedAt(@PathVariable  Long id) {
		service.deletedAt(id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable  Long id) {
		service.delete(id);
	}
}

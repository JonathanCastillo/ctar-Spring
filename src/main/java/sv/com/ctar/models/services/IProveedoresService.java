package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.Proveedores;

public interface IProveedoresService {
	public List<Proveedores> findAll();
	public void save(Proveedores proveedores);
	public Proveedores findOne (Long id);
	public void delete (Long id);
	
}

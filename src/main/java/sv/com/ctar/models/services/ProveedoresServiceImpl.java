package sv.com.ctar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.IProveedoresDao;
import sv.com.ctar.models.entities.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{

	@Autowired
	private IProveedoresDao proveedoresDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Proveedores>findAll()
	{
		return (List<Proveedores>)proveedoresDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Proveedores findOne(Long id)
	{
		return proveedoresDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Proveedores proveedores) 
	{
		proveedoresDao.save(proveedores);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		proveedoresDao.deleteById(id);
	}
}

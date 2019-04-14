package sv.com.ctar.models.services;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ctar.models.dao.IProductosDao;
import sv.com.ctar.models.entities.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {
	@Autowired
	private IProductosDao productosDao;

	@Override
	@Transactional(readOnly=true)
	public List<Productos>findAll()
	{
		return (List<Productos>)productosDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Productos findOne(Long id)
	{
		return productosDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Productos productos) 
	{
		productosDao.save(productos);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		productosDao.deleteById(id);
	}
	
	
	

}


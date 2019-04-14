package sv.com.ctar.models.services;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.ICategoriasDao;
import sv.com.ctar.models.entities.Categorias;

@Service
public class CategoriasServiceImpl2 implements ICategoriasService{
	
	@Autowired
	private ICategoriasDao categoriasDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Categorias> findAll()
	{
		return (List<Categorias>) categoriasDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Categorias findOne(Long id)
	{
		return categoriasDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Categorias categorias) 
	{
		categoriasDao.save(categorias);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		categoriasDao.deleteById(id);
	}
}

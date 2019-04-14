package sv.com.ctar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.ITipoOperacionDao;
import sv.com.ctar.models.entities.TipoOperacion;

@Service
public class TipoOperacionServiceImpl implements ITipoOperacionService{
	@Autowired
	private ITipoOperacionDao tipooperacionDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<TipoOperacion> findAll()
	{
		return (List<TipoOperacion>) tipooperacionDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public TipoOperacion findOne(Long id)
	{
		return tipooperacionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(TipoOperacion tipooperacion) 
	{
		tipooperacionDao.save(tipooperacion);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		tipooperacionDao.deleteById(id);
	}
}

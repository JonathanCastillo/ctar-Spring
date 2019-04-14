package sv.com.ctar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.IComprobanteDao;
import sv.com.ctar.models.entities.Comprobante;

@Service
public class ComprobanteServiceImpl implements IComprobanteService {

	@Autowired
	private IComprobanteDao comprobanteDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Comprobante> findAll()
	{
		return (List<Comprobante>) comprobanteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Comprobante findOne(Long id)
	{
		return comprobanteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Comprobante comprobante) 
	{
		comprobanteDao.save(comprobante);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		comprobanteDao.deleteById(id);
	}
}

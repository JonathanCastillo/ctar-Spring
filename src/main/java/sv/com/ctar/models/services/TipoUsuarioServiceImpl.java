package sv.com.ctar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.ITipoUsuarioDao;
import sv.com.ctar.models.entities.TipoUsuario;

@Service
public class TipoUsuarioServiceImpl implements ITipoUsuarioService {
	@Autowired
	private ITipoUsuarioDao tipousuarioDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<TipoUsuario> findAll()
	{
		return (List<TipoUsuario>) tipousuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public TipoUsuario findOne(Long id)
	{
		return tipousuarioDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(TipoUsuario tipousuario) 
	{
		tipousuarioDao.save(tipousuario);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		tipousuarioDao.deleteById(id);
	}
}

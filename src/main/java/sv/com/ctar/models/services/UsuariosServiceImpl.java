package sv.com.ctar.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.ctar.models.dao.IUsuariosDao;
import sv.com.ctar.models.entities.Usuarios;

@Service
public class UsuariosServiceImpl implements IUsuariosService{
	@Autowired
	private IUsuariosDao usuariosDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Usuarios> findAll()
	{
		return (List<Usuarios>) usuariosDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Usuarios findOne(Long id)
	{
		return usuariosDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Usuarios usuarios) 
	{
		usuariosDao.save(usuarios);
	}
	@Override
	@Transactional
	public void delete(Long id) 
	{
		usuariosDao.deleteById(id);
	}
}

package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.TipoUsuario;

public interface ITipoUsuarioService {
	public List<TipoUsuario> findAll();
	public void save (TipoUsuario tipousuario);
	public TipoUsuario findOne (Long id);
	public void delete (Long id);
}

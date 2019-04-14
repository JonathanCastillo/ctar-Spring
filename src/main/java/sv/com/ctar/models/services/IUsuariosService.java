package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.Usuarios;

public interface IUsuariosService {
	public List<Usuarios> findAll();
	public void save (Usuarios usuarios);
	public Usuarios findOne (Long id);
	public void delete (Long id);
}

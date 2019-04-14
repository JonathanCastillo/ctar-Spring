package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.TipoOperacion;

public interface ITipoOperacionService {
	public List<TipoOperacion> findAll();
	public void save (TipoOperacion tipooperacion);
	public TipoOperacion findOne (Long id);
	public void delete (Long id);
}

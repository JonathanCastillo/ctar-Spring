package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.Comprobante;

public interface IComprobanteService {
	public List<Comprobante> findAll();
	public void save (Comprobante comprobante);
	public Comprobante findOne(Long id);
	public void delete (Long id);
}

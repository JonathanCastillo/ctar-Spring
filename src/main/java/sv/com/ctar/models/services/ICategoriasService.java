package sv.com.ctar.models.services;

import java.util.List;

import sv.com.ctar.models.entities.Categorias;

public interface ICategoriasService {
	public List<Categorias> findAll();
	public void save (Categorias categorias);
	public Categorias findOne(Long id);
	public void delete (Long id);
}

package sv.com.ctar.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ctar.models.entities.Categorias;

public interface ICategoriasDao extends CrudRepository<Categorias, Long> {

}

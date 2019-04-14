package sv.com.ctar.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ctar.models.entities.Productos;

public interface IProductosDao extends CrudRepository<Productos, Long>{

}

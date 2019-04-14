package sv.com.ctar.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ctar.models.entities.TipoOperacion;

public interface ITipoOperacionDao extends CrudRepository <TipoOperacion, Long> {

}

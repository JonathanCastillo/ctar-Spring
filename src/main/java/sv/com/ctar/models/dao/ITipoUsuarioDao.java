package sv.com.ctar.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ctar.models.entities.TipoUsuario;

public interface ITipoUsuarioDao extends CrudRepository <TipoUsuario, Long>{

}

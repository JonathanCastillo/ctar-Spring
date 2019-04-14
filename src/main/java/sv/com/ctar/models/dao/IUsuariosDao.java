package sv.com.ctar.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ctar.models.entities.Usuarios;

public interface IUsuariosDao extends CrudRepository <Usuarios, Long> {

}

package sv.com.ctar.models.services;
import java.util.List;

import sv.com.ctar.models.entities.Productos;;
public interface IProductosService {

	public List<Productos> findAll();
	
	public void save(Productos productos);
	public Productos findOne(Long id);
	public void delete (Long id);
}

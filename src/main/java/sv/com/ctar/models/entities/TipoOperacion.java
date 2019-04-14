package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tipo_operacion")
public class TipoOperacion {
	@Id
	private int Id_Operacion;
	@NotEmpty
	private String Nombre;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Operacion", nullable = false)
	public int getId_Operacion() {
		return Id_Operacion;
	}
	public void setId_Operacion(int id_Operacion) {
		Id_Operacion = id_Operacion;
	}
	
	@Column(name = "Nombre", nullable = false)
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
	
}

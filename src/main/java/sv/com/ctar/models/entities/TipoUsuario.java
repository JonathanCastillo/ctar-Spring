package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
	@Id
	private int Id_Tipo;
	@NotEmpty
	private String Nombre;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Tipo", nullable = false)
	public int getId_Tipo() {
		return Id_Tipo;
	}
	public void setId_Tipo(int id_Tipo) {
		Id_Tipo = id_Tipo;
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

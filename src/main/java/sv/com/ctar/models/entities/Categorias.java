package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "categorias")
public class Categorias {
	
	@Id
	private int Id_Categoria;
	@Column(name="Id_Categoria")
	@NotEmpty
	private String Nombre;
	@Column(name="Nombre")
	@NotEmpty
	private String Imagen;
	@Column(name="Imagen")
	@NotEmpty
	private String Descripcion;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Categoria", nullable = false)
	public int getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(int id_Categoria) {
		Id_Categoria = id_Categoria;
	}
	
	@Column(name = "Nombre", nullable = false)
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	@Column(name = "Imagen", nullable = false)
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	
	@Column(name = "Descripcion", nullable = false)
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
}

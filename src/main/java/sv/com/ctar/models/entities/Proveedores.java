package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "productos")
public class Proveedores {
	@Id
	private int Id_Proveedor;
	@NotEmpty
	private String Nombres;
	@NotEmpty
	private String Apellidos; 
	@NotEmpty
	private String Empresa;
	@NotEmpty
	private String Foto;
	@NotEmpty
	private String Direccion;
	@NotEmpty
	private String Telefono;
	@NotEmpty
	private String Email;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Proveedor", nullable = false)
	public int getId_Proveedor() {
		return Id_Proveedor;
	}
	public void setId_Proveedor(int id_Proveedor) {
		Id_Proveedor = id_Proveedor;
	}
	
	@Column(name = "Nombres", nullable = false)
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	
	@Column(name = "Apellidos", nullable = false)
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	@Column(name = "Empresa", nullable = false)
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	
	@Column(name = "Foto", nullable = false)
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	
	@Column(name = "Direccion", nullable = false)
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	@Column(name = "Telefono", nullable = false)
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	@Column(name = "Email", nullable = false)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
	
}

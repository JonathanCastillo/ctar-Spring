package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
	private int Id_Usuario;
	@NotEmpty
	private String Nombres;
	@NotEmpty
	private String Apellidos; 
	@NotEmpty
	private String User_Name; 
	@NotEmpty
	private String Email; 
	@NotEmpty
	private String Password; 
	@NotEmpty
	private String Foto_Perfil; 
	@NotEmpty
	private int Tipo_Usuario; 
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Usuario", nullable = false)
	public int getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
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
	
	@Column(name = "User_Name", nullable = false)
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	
	@Column(name = "Email", nullable = false)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Column(name = "Password", nullable = false)
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Column(name = "Foto_Perfil", nullable = false)
	public String getFoto_Perfil() {
		return Foto_Perfil;
	}
	public void setFoto_Perfil(String foto_Perfil) {
		Foto_Perfil = foto_Perfil;
	}
	
	@Column(name = "Tipo_Usuario", nullable = false)
	public int getTipo_Usuario() {
		return Tipo_Usuario;
	}
	public void setTipo_Usuario(int tipo_Usuario) {
		Tipo_Usuario = tipo_Usuario;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	} 
	
}

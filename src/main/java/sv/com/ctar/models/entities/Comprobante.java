package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "comprobante")
public class Comprobante {

	@Id
	private int Id_Comprobante;
	@NotEmpty
	private int Id_Operacion;
	@NotEmpty
	private int Id_Usuario; 
	@NotEmpty
	private String Nombre_Cliente;
	@NotEmpty
	private double Total;
	@NotEmpty
	private String Descripcion;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String Fecha;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Comprobante", nullable = false)
	public int getId_Comprobante() {
		return Id_Comprobante;
	}
	public void setId_Comprobante(int id_Comprobante) {
		Id_Comprobante = id_Comprobante;
	}
	
	@Column(name = "Id_Operacion", nullable = false)
	public int getId_Operacion() {
		return Id_Operacion;
	}
	public void setId_Operacion(int id_Operacion) {
		Id_Operacion = id_Operacion;
	}
	
	@Column(name = "Id_Usuario", nullable = false)
	public int getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	
	@Column(name = "Nombre_Cliente", nullable = false)
	public String getNombre_Cliente() {
		return Nombre_Cliente;
	}
	public void setNombre_Cliente(String nombre_Cliente) {
		Nombre_Cliente = nombre_Cliente;
	}
	
	@Column(name = "Total", nullable = false)
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	
	@Column(name = "Descripcion", nullable = false)
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	@Column(name = "Fecha", nullable = false)
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
	

	
}

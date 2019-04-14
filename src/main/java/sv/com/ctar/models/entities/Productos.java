package sv.com.ctar.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	private int Id_Producto;
	@NotEmpty
	private int Id_Categoria;
	@NotEmpty
	private int Id_Proveedor; 
	@NotEmpty
	private String Nombre;
	@NotEmpty
	private String Imagen;
	@NotEmpty
	private String Descripcion;
	@NotEmpty
	private float Precio_Compra;
	@NotEmpty
	private float Precio_Venta;
	@NotEmpty
	private int Disponibles;
	@NotEmpty
	private int Estado;
	
	@Column(name = "Id_Producto", nullable = false)
	public int getId_Producto() {
		return Id_Producto;
	}
	//######################################################################
	public void setId_Producto(int id_Producto) {
		Id_Producto = id_Producto;
	}
	
	@Column(name = "Id_Categoria", nullable = false)
	public int getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(int id_Categoria) {
		Id_Categoria = id_Categoria;
	}
	
	@Column(name = "Id_Proveedor", nullable = false)
	public int getId_Proveedor() {
		return Id_Proveedor;
	}
	public void setId_Proveedor(int id_Proveedor) {
		Id_Proveedor = id_Proveedor;
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
	
	@Column(name = "Precio_Compra", nullable = false)
	public float getPrecio_Compra() {
		return Precio_Compra;
	}
	public void setPrecio_Compra(float precio_Compra) {
		Precio_Compra = precio_Compra;
	}
	
	@Column(name = "Precio_Venta", nullable = false)
	public float getPrecio_Venta() {
		return Precio_Venta;
	}
	public void setPrecio_Venta(float precio_Venta) {
		Precio_Venta = precio_Venta;
	}
	
	@Column(name = "Disponibles", nullable = false)
	public int getDisponibles() {
		return Disponibles;
	}
	public void setDisponibles(int disponibles) {
		Disponibles = disponibles;
	}
	
	@Column(name = "Estado", nullable = false)
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	} 
	
	

}

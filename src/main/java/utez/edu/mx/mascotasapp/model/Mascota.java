package utez.edu.mx.mascotasapp.model;

public class Mascota {
	private Long id;
	private String nombre;
	private Integer edad;
	private String descripcion;
	private String tipoMascota;
	private String imagen;
	private Boolean disponibleAdopcion;

	public Mascota() {

	}

	public Mascota(Long id, String nombre, Integer edad, String descripcion, String tipoMascota, String imagen,
			Boolean disponibleAdopcion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
		this.tipoMascota = tipoMascota;
		this.imagen = imagen;
		this.disponibleAdopcion = disponibleAdopcion;
	}

	public Mascota(String nombre, Integer edad, String descripcion, String tipoMascota, String imagen,
			Boolean disponibleAdopcion) {
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
		this.tipoMascota = tipoMascota;
		this.imagen = imagen;
		this.disponibleAdopcion = disponibleAdopcion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getImagen() {
		return imagen;
	}

	public void setDisponibleAdopcion(Boolean disponibleAdopcion) {
		this.disponibleAdopcion = disponibleAdopcion;
	}

	public Boolean isDisponibleAdopcion() {
		return disponibleAdopcion;
	}
}

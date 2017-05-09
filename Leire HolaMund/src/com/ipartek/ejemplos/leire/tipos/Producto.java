package com.ipartek.ejemplos.leire.tipos;

public class Producto {
	private String nombre, descripcion, errores;
	private int id, precio;

	@Override
	public int hashCode() {
		//			final int prime = 31;
		//			int result = 1;
		//			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		//			result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}

	public Producto(String nombre, String descripcion, Integer id, Integer precio) {
		super();
		this.nombre = nombre;
		this.setDescripcion(descripcion);
		this.setId(id);
		this.setPrecio(precio);
	}

	public Producto() {
		this("");
	}

	@Override
	public String toString() {
		return "Producto [ID=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio= " + precio + "]";
	}

	public String getErrores() {
		return errores;
	}

	public void setErrores(String errores) {
		this.errores = errores;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}

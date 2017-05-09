package com.ipartek.ejemplos.leire.dal;

import com.ipartek.ejemplos.leire.tipos.Producto;

public interface ProductosDAL {
	public void alta(Producto producto);

	public void modificar(Producto producto);

	public void borrar(Producto producto);

	public Producto buscarPorId(String id);

	public Producto[] buscarTodosLosUsuarios();

	public boolean validar(Producto producto);
}

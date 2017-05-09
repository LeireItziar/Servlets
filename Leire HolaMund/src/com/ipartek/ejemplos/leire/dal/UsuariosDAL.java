package com.ipartek.ejemplos.leire.dal;

import com.ipartek.ejemplos.leire.tipos.Producto;

public interface UsuariosDAL {
	public void alta(Producto usuario);

	public void modificar(Producto usuario);

	public void borrar(Producto usuario);

	public Producto buscarPorId(String id);

	public Producto[] buscarTodosLosUsuarios();

	public boolean validar(Producto usuario);
}

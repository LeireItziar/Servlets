package com.ipartek.ejemplos.leire.dal;

import com.ipartek.ejemplos.leire.tipos.Producto;

public class UsuariosDALUsuarioUnico implements UsuariosDAL {

	private Producto usuario;

	@Override
	public void alta(Producto usuario) {
		if (this.usuario.getNombre().equals(usuario.getNombre()))
			throw new DALException("Ya existe un usuario con ese nombre: " + usuario);

		this.usuario = usuario;
	}

	@Override
	public boolean validar(Producto usuario) {
		return this.usuario != null && this.usuario.equals(usuario);
	}

	@Override
	public void modificar(Producto usuario) {
		if (!this.usuario.getNombre().equals(usuario.getNombre()))
			throw new DALException("No se ha encontrado el usuario a modificar " + usuario);
		this.usuario = usuario;

	}

	@Override
	public void borrar(Producto usuario) {
		if (this.usuario.equals(usuario))
			this.usuario = null;
	}

	@Override
	public Producto buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto[] buscarTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}

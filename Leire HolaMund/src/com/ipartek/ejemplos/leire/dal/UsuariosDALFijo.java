package com.ipartek.ejemplos.leire.dal;

import com.ipartek.ejemplos.leire.tipos.Usuario;

public class UsuariosDALFijo implements UsuariosDAL {

	private Usuario usuario;

	@Override
	public void alta(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean validar(Usuario usuario) {
		return this.usuario.equals(usuario);
	}

}

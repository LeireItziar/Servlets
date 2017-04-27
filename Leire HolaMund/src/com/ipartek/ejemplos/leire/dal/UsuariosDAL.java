package com.ipartek.ejemplos.leire.dal;

import com.ipartek.ejemplos.leire.tipos.Usuario;

public interface UsuariosDAL {
	public void alta(Usuario usuario);

	public boolean validar(Usuario usuario);
}

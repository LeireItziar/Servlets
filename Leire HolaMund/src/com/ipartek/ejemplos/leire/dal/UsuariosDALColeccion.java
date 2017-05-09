package com.ipartek.ejemplos.leire.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.ejemplos.leire.tipos.Producto;

public class UsuariosDALColeccion implements UsuariosDAL {

	private Map<String, Producto> usuarios = new HashMap<String, Producto>();

	@Override
	public void alta(Producto usuario) {
		if (usuarios.containsKey(usuario.getNombre()))
			throw new UsuarioYaExistenteDALException("Ya existe el usuario " + usuario.getNombre());

		usuarios.put(usuario.getNombre(), usuario);
	}

	@Override
	public boolean validar(Producto usuario) {
		return usuarios.containsValue(usuario);
	}

	@Override
	public void modificar(Producto usuario) {
		if (!usuarios.containsKey(usuario.getNombre()))
			throw new DALException("Intento de modificar usuario no existente " + usuario);

		usuarios.put(usuario.getNombre(), usuario);
	}

	@Override
	public void borrar(Producto usuario) {
		usuarios.remove(usuario.getNombre());
	}

	@Override
	public Producto buscarPorId(String id) {
		return usuarios.get(id);
	}

	@Override
	public Producto[] buscarTodosLosUsuarios() {
		// Usuario[] arr = new Usuario[usuarios.size()];
		//
		// int i = 0;
		//
		// for(Usuario usuario : usuarios.values())
		// arr[i++] = usuario;
		//
		// return arr;

		return usuarios.values().toArray(new Producto[usuarios.size()]);
	}

}

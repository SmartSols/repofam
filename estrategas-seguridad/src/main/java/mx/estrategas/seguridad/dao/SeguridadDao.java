package mx.estrategas.seguridad.dao;

import java.util.List;

import mx.estrategas.seguridad.modelo.RolSeguridad;
import mx.estrategas.seguridad.modelo.UsuarioSeguridad;

/**
 * Servicios de acceso a datos para roles y usuario de seguridad.
 * 
 * @author Alejandro Pimentel
 *
 */
public interface SeguridadDao {

	List<UsuarioSeguridad> consultarUsuarios();
	
	List<RolSeguridad> consultarRoles();
	
	UsuarioSeguridad consultarUsuarioConRoles(String username);
	
	List<UsuarioSeguridad> consultarUsuariosConRoles();
}

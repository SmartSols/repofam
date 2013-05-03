package mx.estrategas.seguridad.servicios;

import java.util.List;

import mx.estrategas.seguridad.modelo.UsuarioSeguridad;

public interface MttoSeguridadServicio {

	List<UsuarioSeguridad> consultarUsuarios();
	
	List<UsuarioSeguridad> consultarUsuariosConRoles();
}

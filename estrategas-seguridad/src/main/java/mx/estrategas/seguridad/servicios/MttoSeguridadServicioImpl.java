package mx.estrategas.seguridad.servicios;

import java.util.List;

import mx.estrategas.seguridad.dao.SeguridadDao;
import mx.estrategas.seguridad.modelo.UsuarioSeguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MttoSeguridadServicioImpl implements MttoSeguridadServicio{

	@Autowired
	private SeguridadDao seguridadDao;
	
	public List<UsuarioSeguridad> consultarUsuarios() {
		return seguridadDao.consultarUsuarios();
	}

	public List<UsuarioSeguridad> consultarUsuariosConRoles() {
		return seguridadDao.consultarUsuariosConRoles();
	}
}

package test.mx.estrategas.fam.dao;

import java.util.List;


import mx.estrategas.fam.dao.UsuarioDao;
import mx.estrategas.fam.datos.vo.FiltroBusquedaVO;
//import mx.estrategas.fam.modelo.Usuario;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioDaoTest extends BaseDaoTest {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Test
	public void ejemploTest(){
		//Assert.assertNotNull(usuarioDao);
	}
	
	@Test
	public void guardarFormularioTest(){
	//	Usuario usuario = new Usuario();
		

		
		//Integer id = usuarioDao.guardar(usuario);
		
//		Assert.assertEquals(new Integer(1), id);
	//	Assert.assertNotNull(usuario.getId());
	}
	
	@Test
	public void consultarFormularioByIdTest(){
		//Usuario usuario = usuarioDao.consultar(new Long(1));

		//Assert.assertNotNull(usuario);
	}
	
	@Test
	public void consultarPaginadosTest(){
//		FiltroBusquedaVO vo = new FiltroBusquedaVO(0, 2, "nombre", "asc");
		//List<Usuario> usuarios = usuarioDao.consultarPaginados(vo);
		
		//Assert.assertFalse(usuarios.isEmpty());
		//Assert.assertEquals(2, usuarios.size());
	}
	
	@Test
	public void contarTest(){
		//Integer cuenta = usuarioDao.contar();
		
		//Assert.assertEquals(new Integer(3), cuenta);
	}
}

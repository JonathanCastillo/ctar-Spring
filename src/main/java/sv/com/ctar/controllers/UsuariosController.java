package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.Usuarios;
import sv.com.ctar.models.services.IUsuariosService;

@RestController
@RequestMapping("/ctar/api/v1/usuarios")
public class UsuariosController {
	@Autowired
	private IUsuariosService usuariosService;
	
	@RequestMapping ("")
	private List<Usuarios> findAll() 
	{
		return usuariosService.findAll();
	}
}

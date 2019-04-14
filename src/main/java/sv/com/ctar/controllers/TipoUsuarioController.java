package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.TipoUsuario;
import sv.com.ctar.models.services.ITipoUsuarioService;

@RestController
@RequestMapping ("/ctar/api/v1/tipousuario")
public class TipoUsuarioController {
	@Autowired
	private ITipoUsuarioService tipousuarioService;
	
	@RequestMapping ("")
	private List<TipoUsuario> findAll()
	{
		return tipousuarioService.findAll();
	}
}

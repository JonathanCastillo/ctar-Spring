package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.TipoOperacion;
import sv.com.ctar.models.services.ITipoOperacionService;

@RestController
@RequestMapping("/ctar/api/v1/tipooperacion")
public class TipoOperacionController {
	@Autowired
	private ITipoOperacionService tipooperacionService;
	
	@RequestMapping ("")
	private List<TipoOperacion> findAll()
	{
		return tipooperacionService.findAll();
	}
}

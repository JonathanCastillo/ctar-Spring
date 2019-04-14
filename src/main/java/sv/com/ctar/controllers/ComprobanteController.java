package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.Comprobante;
import sv.com.ctar.models.services.IComprobanteService;

@RestController
@RequestMapping ("/ctar/api/v1/comprobante")
public class ComprobanteController {
	@Autowired
	private IComprobanteService comprobanteService;
	@RequestMapping("")
	private List<Comprobante> findAll()
	{
		return comprobanteService.findAll();
		
	}
}

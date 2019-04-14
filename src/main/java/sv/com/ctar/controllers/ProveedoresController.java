package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.Proveedores;
import sv.com.ctar.models.services.IProveedoresService;

@RestController
@RequestMapping ("/ctar/api/v1/proveedores")
public class ProveedoresController {
	
	@Autowired
	private IProveedoresService proveedoresService;
	
	@RequestMapping ("")
	private List<Proveedores> findAll()
	{
		return proveedoresService.findAll();
	}
}

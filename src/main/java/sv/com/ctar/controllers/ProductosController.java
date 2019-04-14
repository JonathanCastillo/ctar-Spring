package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.Productos;
import sv.com.ctar.models.services.IProductosService;

@RestController
@RequestMapping ("/ctar/api/v1/productos")
public class ProductosController {
	@Autowired
	private IProductosService productosService;
	@RequestMapping("")
	private List<Productos> findAll()
	{
		return productosService.findAll();
	}

}

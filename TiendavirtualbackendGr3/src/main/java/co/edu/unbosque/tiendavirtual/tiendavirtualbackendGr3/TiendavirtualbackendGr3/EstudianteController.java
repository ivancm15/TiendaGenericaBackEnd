package co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DAO.*;
import co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DTO.*;
//Aqui vamos a crear el control de la tienda

@RestController

public class EstudianteController {
	
	//Aqui permite consultar la lista de estudiantes
	@RequestMapping("/listarEstudiantes")
	public ArrayList<Estudiante> listaDeEstudiantes(){
		EstudianteDAO objDAO = new EstudianteDAO();
				return objDAO.listaDeEstudiantes();
	}
	
	@PostMapping("registrarEstudiante")
	public Estudiante registrarEstudiante(@RequestBody Estudiante persona) {
		EstudianteDAO dao = new EstudianteDAO();
		return dao.registrarEstudiante(persona);
	}
	
}

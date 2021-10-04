package co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DAO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

import co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DTO.*;
import co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.*;

//Aqui vamos a crear los metodos listar y registrar estudiantes

public class EstudianteDAO {

	//Aqui permite consultar a los estudiantes
	
	public ArrayList <Estudiante> listaDeEstudiantes(){
		ArrayList<Estudiante> misEstudiantes = new ArrayList<Estudiante>();
		conexion conex = new conexion();
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM estudiante");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				int id = Integer.parseInt(res.getString("id"));
				String correoIns =res.getString("correo_institucional");
				String nombres = res.getString("nombres");
				String apellidos = res.getString("apellidos");
				String telefonoFijo = res.getString("telefono_fijo");
				String telefonoCelular = res.getString("telefono_celular");
				String correoPersonal = res.getString("correo_personal");
				String programa = res.getString("programa_academico");
				String fechaNac = res.getString("fecha_nacimiento");
				
				Estudiante persona = new Estudiante(id, correoIns, nombres, apellidos, telefonoFijo, telefonoCelular,
													correoPersonal, programa, fechaNac);
				misEstudiantes.add(persona);
			}
				res.close();
				consulta.close();
				conex.desconectar();
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se pudo consultar las personas \n"+e);
			
		}
		return misEstudiantes;
	}
	
	public Estudiante registrarEstudiante(Estudiante persona) {
		conexion conex = new conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO estudiante VALUE ('"+persona.getId()+"',"+persona.getCorreoInstitucional()+"','"+persona.getNombres()+"','"+persona.getApellidos()+"','"
			+persona.getTelefonoCelular()+"','"+persona.getTelefonoFijo()+"','"+persona.getCorreoPersonal()+"','"
					+persona.getPrograma()+"','"+persona.getFechaNacimiento()+"')");
			
			estatuto.close();
			conex.desconectar();
					
		}catch(SQLException e){
			persona = null;
			System.out.println (e.getMessage());
		}
		
		return persona;
	}
}

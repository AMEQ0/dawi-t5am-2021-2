package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	public static void main(String[] args) {
		// obtener la conexi�n con la BD -> seg�n unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la f�brica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: actualizar nuevo usuario
		Usuario  u = new Usuario();
		u.setCodigo(21);
		u.setNombre("Eren");
		u.setApellido("Wever");
		u.setUsuario("takae@gmail.com");
		u.setClave("paloma");
		u.setFnacim("2021/08/24");
		u.setTipo(1);
		u.setEstado(1);
		
		
		//para registrar,actualizar,eliminar -> transacciones
		em.getTransaction().begin();
		
		em.merge(u);// para actualizar -> si existe el c�digo pero si no existe lo registra
		
		em.getTransaction().commit();
		System.out.println("Actualizaci�n Ok");
		
		em.close();
	} 
	
}

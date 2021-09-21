package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	public static void main(String[] args) {
		// obtener la conexión con la BD -> según unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la fábrica
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
		
		em.merge(u);// para actualizar -> si existe el código pero si no existe lo registra
		
		em.getTransaction().commit();
		System.out.println("Actualización Ok");
		
		em.close();
	} 
	
}

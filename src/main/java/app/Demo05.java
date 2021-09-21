package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	public static void main(String[] args) {
		// obtener la conexión con la BD -> según unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la fábrica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: obtener la información de un usuario
		Usuario  u = em.find(Usuario.class, 21);// devuelve el  obj usuario , según la PK
		
		if(u == null) {
			System.out.println("Código no existe");	
		}else {
			System.out.println("Eliminando el usuario");
			em.getTransaction().begin();
			
			em.remove(u);// para elminar (borrar de la tabla) / cambiar de estado
			
			em.getTransaction().commit();
			System.out.println("Eliminación Ok");
		}
		em.close();
	} 
}

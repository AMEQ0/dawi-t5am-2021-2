package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	public static void main(String[] args) {
		// obtener la conexi�n con la BD -> seg�n unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la f�brica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: obtener la informaci�n de un usuario
		Usuario  u = em.find(Usuario.class, 21);// devuelve el  obj usuario , seg�n la PK
		
		if(u == null) {
			System.out.println("C�digo no existe");	
		}else {
			System.out.println("Eliminando el usuario");
			em.getTransaction().begin();
			
			em.remove(u);// para elminar (borrar de la tabla) / cambiar de estado
			
			em.getTransaction().commit();
			System.out.println("Eliminaci�n Ok");
		}
		em.close();
	} 
}

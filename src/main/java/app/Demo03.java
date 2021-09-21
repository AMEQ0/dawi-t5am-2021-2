package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	public static void main(String[] args) {
		// obtener la conexi�n con la BD -> seg�n unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la f�brica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: eliminar nuevo usuario
		Usuario  u = new Usuario();
		u.setCodigo(21);
		
		
		
		//para registrar,actualizar,eliminar -> transacciones
		em.getTransaction().begin();
		
		em.remove(u);// para elminar
		
		em.getTransaction().commit();
		System.out.println("Eliminaci�n Ok");
		
		em.close();
	} 
}

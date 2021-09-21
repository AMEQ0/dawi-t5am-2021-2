package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
	public static void main(String[] args) {
		// obtener la conexi�n con la BD -> seg�n unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la f�brica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: obtener la informaci�n de un usuario
		Usuario  u = em.find(Usuario.class, 20);// devuelve el  obj usuario , seg�n la PK
		
		if(u == null) {
			System.out.println("C�digo no existe");	
		}else {
			System.out.println("Bienvenido : "+u.getNombre());
			System.out.println(u);
		}
		em.close();
	} 
}

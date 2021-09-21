package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
	public static void main(String[] args) {
		// obtener la conexión con la BD -> según unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la fábrica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: obtener la información de un usuario
		Usuario  u = em.find(Usuario.class, 20);// devuelve el  obj usuario , según la PK
		
		if(u == null) {
			System.out.println("Código no existe");	
		}else {
			System.out.println("Bienvenido : "+u.getNombre());
			System.out.println(u);
		}
		em.close();
	} 
}

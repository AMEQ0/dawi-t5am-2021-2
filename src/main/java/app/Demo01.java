package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	public static void main(String[] args) {
		// obtener la conexión con la BD -> según unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la fábrica
		EntityManager em = fabrica.createEntityManager();
		
		//proceso: registrar nuevo usuario
		Usuario  u = new Usuario();
		u.setCodigo(19);
		u.setNombre("Eren");
		u.setApellido("Ackerman");
		u.setUsuario("tatakae@gmail.com");
		u.setClave("12345");
		u.setFnacim("2021/08/24");
		u.setTipo(1);
		u.setEstado(1);
		
		
		//para registrar,actualizar,eliminar -> transacciones
		em.getTransaction().begin();
		
		em.persist(u);// para registrar
		
		em.getTransaction().commit();
		System.out.println("Registro Ok");
		
		em.close();
	} 
}

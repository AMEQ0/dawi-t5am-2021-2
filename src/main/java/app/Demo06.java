package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo06 {
	public static void main(String[] args) {
		// obtener la conexión con la BD -> según unidad de persistencia -> DAOFactory fabrica 
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		//crear los DAO usando la fábrica
		EntityManager em = fabrica.createEntityManager();
		String sql= "Select u From Usuario u";
		//proceso: obtener la información de un usuario
		List<Usuario> lstUsuarios = em.createQuery(sql,Usuario.class).getResultList();
		System.out.println("Nro de Usuarios : "+lstUsuarios.size());  
		for (Usuario u : lstUsuarios) {
			System.out.println("Siguiente empleado :"+ u);
		}
		System.out.println("Listado de los usuarios x tipo");
		// string sql =select * from tb_usuarios where idtipo="?"; //<----JDBC
		String sql2= "Select u From Usuario u where u.tipo = :xtipo"; // JPA
		//proceso: obtener la información de un usuario
		TypedQuery<Usuario> query = em.createQuery(sql2,Usuario.class);
		query.setParameter("xtipo", 1);
		List<Usuario> lstUsuarios2 = query.getResultList();
		
		System.out.println("Nro de Usuarios : "+lstUsuarios2.size());  
		for (Usuario u : lstUsuarios2) {
			System.out.println("Siguiente empleado :"+ u);
		}
		
		
		
		
		em.close();
	} 
}

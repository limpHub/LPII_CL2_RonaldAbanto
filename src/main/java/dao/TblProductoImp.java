package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfases.IProducto;
import model.TblProductocl2;;

public class TblProductoImp implements IProducto {

	public void RegistrarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_RonaldAbanto");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//regisdtramos en la bd
		emanager.persist(producto);
		//msj por consola
		System.out.println("producto registrado");
		//confimacmos transaccion
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
	}

	public List<TblProductocl2> ListarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("LPII_CL2_RonaldAbanto");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblProductocl2> listado=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		return listado;
	}

}

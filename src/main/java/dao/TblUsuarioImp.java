package dao;

import interfases.IUsuario;
import model.TblUsuariocl2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
public class TblUsuarioImp implements IUsuario {

	public TblUsuariocl2 validarUsuario(String username, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_RonaldAbanto");
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT u FROM TblUsuariocl2 u WHERE u.usuarioCL2 = :usuarioCL2 AND u.passwordCl2 = :passwordCl2", TblUsuariocl2.class)
                    .setParameter("usuarioCL2", username)
                    .setParameter("passwordCl2", password)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
	}

}

package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by gnosocrome on 24/07/15.
 */
public class ConexionBD {

    private static EntityManager em;

    public static void conectar() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("persistenceUnit");
        em = emf.createEntityManager();
    }

    public static EntityManager getEm() {
        return em;
    }

}

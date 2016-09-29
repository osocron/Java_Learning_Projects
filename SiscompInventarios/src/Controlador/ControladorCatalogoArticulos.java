package Controlador;

import Modelo.CatalogoArticulosEntity;
import Modelo.SiscompArticulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by gnosocrome on 24/07/15.
 */
public class ControladorCatalogoArticulos {

    public ControladorCatalogoArticulos(){
    }

    public static List<SiscompArticulo> getListaArticulos(){
        List<Object[]> listaObjetos = ConexionBD.getEm().
                createQuery("SELECT a.claArti, a.desGrup, a.desArti, a.barCode, a.preMayo, a.prePubl from CatalogoArticulosEntity a").getResultList();
        List<SiscompArticulo> listaArticulos = new ArrayList<>();
        listaObjetos.forEach(object -> {
            SiscompArticulo articulo = new SiscompArticulo((String) object[0], (String) object[1],
                    (String) object[2], (String) object[3], (double) object[4], (double) object[5]);
            listaArticulos.add(articulo);
        });
        return listaArticulos;
    }

    public static CatalogoArticulosEntity getArticuloPorID(String codigo){
        return ConexionBD.getEm().find(CatalogoArticulosEntity.class, codigo);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Catalogo;
import pojos.Mensaje;

/**
 * REST Web Service
 *
 * @author osocron
 */
@Path("catalogos")
public class CatalogoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CatalogoWS
     */
    public CatalogoWS() {
    }

    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalogo> getAll() {
        List<Catalogo> list = new ArrayList<Catalogo>();
        Catalogo c;
        for (int i = 1; i <= 100; i++) {
            c = new Catalogo(i, "Catalogo prueba "+i, 2000+i, i);
            list.add(c);
        }
        return list;
    }
    
    @Path("allbd")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalogo> getAllBd() {
        List<Catalogo> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Catalogo.getAllCatalogos");
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("byIdtipo/{idtipo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalogo> getCatalogosByIdtipo (
            @PathParam("idtipo") Integer idtipo) {
        List<Catalogo> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Catalogo.getCatalogosByIdtipo", idtipo);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }

    @POST
    @Path("registro")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarCatalogo(@FormParam("idcatalogo") Integer idcatalogo,
                                     @FormParam("idtipo") Integer idtipo,
                                     @FormParam("nombre") String nombre,
                                     @FormParam("orden") Integer orden) {
        Mensaje resultado;
        Catalogo c = new Catalogo(idcatalogo, nombre, idtipo, orden);
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.insert("Catalogo.registrarCatalogo", c);
            conn.commit();
            resultado = new Mensaje("Catalogo registrado correctamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
    @PUT
    @Path("actualizar")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje actualizarCatalogo(@FormParam("idcatalogo") Integer idcatalogo,  
                                      @FormParam("nombre") String nombre,
                                      @FormParam("orden") Integer orden) {
        Mensaje resultado;
        Catalogo c = new Catalogo(idcatalogo, nombre, null, orden);
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.insert("Catalogo.actualizarCatalogo", c);
            conn.commit();
            resultado = new Mensaje("Catalogo actualizado correctamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
    @PUT
    @Path("eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje eliminarCatalogo(
            @FormParam("idcatalogo") Integer idcatalogo) {
        Mensaje resultado;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.delete("Catalogo.eliminarCatalogo", idcatalogo);
            conn.commit();
            resultado = new Mensaje("Catalogo eliminado exitosamente", false);
        } catch (Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
}

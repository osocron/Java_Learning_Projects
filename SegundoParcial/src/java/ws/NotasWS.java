/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.Calendar;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Nota;

/**
 * REST Web Service
 *
 * @author osocron
 */
@Path("notas")
public class NotasWS {
    
    @Context
    private UriInfo context;

    public NotasWS() {
    }
    
    @Path("notasPorUsuario/{idusuario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Nota> notasPorUsuario(@PathParam("idusuario") Integer idUsuario) {
        List<Nota> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if (conn != null) {
            try {
                list = conn.selectList("Nota.notasPorUsuario", idUsuario);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("nuevaNota")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje nuevaNota(@FormParam("idusuario") Integer idUsuario,
                             @FormParam("nombre") String nombre,
                             @FormParam("descripcion") String descripcion) {
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();
        java.sql.Date today = new java.sql.Date(currentDate.getTime());
        Mensaje m;
        SqlSession conn = MyBatisUtil.getSession();
        Nota n = new Nota(null, idUsuario, nombre, descripcion, today);
        try {
            conn.insert("Nota.nuevaNota", n);
            conn.commit();
            m = new Mensaje(false, "Registrada con Exito");
        } catch (Exception ex) {
            ex.printStackTrace();
            m = new Mensaje(true, "No se pudo registrar");
        } finally {
            conn.close();
        }
        return m;
    }
    
    @Path("modificarNota")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje modificarNota(@FormParam("idnota") Integer idNota,
                                 @FormParam("descripcion") String descripcion) {
        Mensaje m;
        SqlSession conn = MyBatisUtil.getSession();
        Nota n = new Nota(idNota, null, null, descripcion, null);
        try {
            conn.update("Nota.modificarNota", n);
            conn.commit();
            m = new Mensaje(false, "Modificada con Exito");
        } catch (Exception ex) {
            ex.printStackTrace();
            m = new Mensaje(true, "No se pudo modificar");
        } finally {
            conn.close();
        }
        return m;
    }
    
    @Path("eliminarNota")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje eliminarNota(@FormParam("idnota") Integer idNota) {
        Mensaje m;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.update("Nota.eliminarNota", idNota);
            conn.commit();
            m = new Mensaje(false, "Eliminada con Exito");
        } catch (Exception ex) {
            ex.printStackTrace();
            m = new Mensaje(true, "No se pudo eliminar");
        } finally {
            conn.close();
        }
        return m;
    }
    
}

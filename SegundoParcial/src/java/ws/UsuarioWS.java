/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Usuario;

/**
 * REST Web Service
 *
 * @author osocron
 */
@Path("usuarios")
public class UsuarioWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioWS
     */
    public UsuarioWS() {
    }

    @Path("login")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario login(@FormParam("email") String email,
                         @FormParam("password") String password) {
        SqlSession conn = MyBatisUtil.getSession();
        Usuario u = new Usuario(null, null, email, password);
        Usuario res = null;
        try {
            res = conn.selectOne("Usuario.login", u);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }
        return res;
    }
    
    
    @Path("registrarUsuario")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarUsuario(@FormParam("nombre") String nombre,
                                    @FormParam("email") String email,
                                    @FormParam("password") String password) {
        Mensaje m;
        SqlSession conn = MyBatisUtil.getSession();
        Usuario u = new Usuario(null, nombre, email, password);
        try {
            conn.insert("Usuario.registrarUsuario", u);
            conn.commit();
            m = new Mensaje(false, "Registrado con Exito");
        } catch (Exception ex) {
            ex.printStackTrace();
            m = new Mensaje(true, "No se pudo registrar");
        } finally {
            conn.close();
        }
        return m;
    }
    
}

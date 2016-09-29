package Modelo;

/**
 * Created by gnosocrome on 24/07/15.
 */
public class SiscompArticulo {

    private String codigoArticulo;
    private String descripGrupo;
    private String descripArti;
    private String codBarras;
    private double precioMay;
    private double precioPublico;

    public SiscompArticulo(String codigoArticulo, String descripGrupo, String descripArti, String codBarras, double precioMay, double precioPublico) {
        this.codigoArticulo = codigoArticulo;
        this.descripGrupo = descripGrupo;
        this.descripArti = descripArti;
        this.codBarras = codBarras;
        this.precioMay = precioMay;
        this.precioPublico = precioPublico;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripGrupo() {
        return descripGrupo;
    }

    public void setDescripGrupo(String descripGrupo) {
        this.descripGrupo = descripGrupo;
    }

    public String getDescripArti() {
        return descripArti;
    }

    public void setDescripArti(String descripArti) {
        this.descripArti = descripArti;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getPrecioMay() {
        return precioMay;
    }

    public void setPrecioMay(double precioMay) {
        this.precioMay = precioMay;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }
}

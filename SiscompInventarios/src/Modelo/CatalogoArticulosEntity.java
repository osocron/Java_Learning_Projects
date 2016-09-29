package Modelo;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by gnosocrome on 24/07/15.
 */
@Entity
@Table(name = "CatalogoArticulos", schema = "", catalog = "ArticulosSiscomp")
public class CatalogoArticulosEntity {
    private String claArti;
    private String articulo;
    private String claGrup;
    private String desArti;
    private String numPart;
    private String barCode;
    private String clase;
    private String subclase;
    private String depto;
    private String barras;
    private double preMayo;
    private double preEspe;
    private double prePubl;
    private Date fecActu;
    private double carMayo;
    private double carEspe;
    private double carPubl;
    private double cosDoll;
    private double tipCamb;
    private int exiMatr;
    private int exiSucu;
    private int exiActu;
    private int exiSuc2;
    private double cosFact;
    private double cosNeto;
    private String desGrup;
    private String claProv;
    private String uniMedi;
    private double cosProm;
    private double priDesc;
    private double segDesc;
    private double terDesc;
    private double carFlet;
    private double numPiez;
    private double exiMini;
    private double exiMaxi;
    private int exiEfra;
    private int exiPaco;
    private int exiInic;
    private Date conteo;

    @Id
    @Column(name = "CLA_ARTI", nullable = false, insertable = true, updatable = true, length = 8)
    public String getClaArti() {
        return claArti;
    }

    public void setClaArti(String claArti) {
        this.claArti = claArti;
    }

    @Basic
    @Column(name = "ARTICULO", nullable = false, insertable = true, updatable = true, length = 8)
    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    @Basic
    @Column(name = "CLA_GRUP", nullable = false, insertable = true, updatable = true, length = 5)
    public String getClaGrup() {
        return claGrup;
    }

    public void setClaGrup(String claGrup) {
        this.claGrup = claGrup;
    }

    @Basic
    @Column(name = "DES_ARTI", nullable = false, insertable = true, updatable = true, length = 45)
    public String getDesArti() {
        return desArti;
    }

    public void setDesArti(String desArti) {
        this.desArti = desArti;
    }

    @Basic
    @Column(name = "NUM_PART", nullable = false, insertable = true, updatable = true, length = 15)
    public String getNumPart() {
        return numPart;
    }

    public void setNumPart(String numPart) {
        this.numPart = numPart;
    }

    @Basic
    @Column(name = "BAR_CODE", nullable = false, insertable = true, updatable = true, length = 15)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "CLASE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Basic
    @Column(name = "SUBCLASE", nullable = false, insertable = true, updatable = true, length = 2)
    public String getSubclase() {
        return subclase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    @Basic
    @Column(name = "DEPTO", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    @Basic
    @Column(name = "BARRAS", nullable = false, insertable = true, updatable = true, length = 15)
    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    @Basic
    @Column(name = "PRE_MAYO", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getPreMayo() {
        return preMayo;
    }

    public void setPreMayo(double preMayo) {
        this.preMayo = preMayo;
    }

    @Basic
    @Column(name = "PRE_ESPE", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getPreEspe() {
        return preEspe;
    }

    public void setPreEspe(double preEspe) {
        this.preEspe = preEspe;
    }

    @Basic
    @Column(name = "PRE_PUBL", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getPrePubl() {
        return prePubl;
    }

    public void setPrePubl(double prePubl) {
        this.prePubl = prePubl;
    }

    @Basic
    @Column(name = "FEC_ACTU", nullable = false, insertable = true, updatable = true)
    public Date getFecActu() {
        return fecActu;
    }

    public void setFecActu(Date fecActu) {
        this.fecActu = fecActu;
    }

    @Basic
    @Column(name = "CAR_MAYO", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCarMayo() {
        return carMayo;
    }

    public void setCarMayo(double carMayo) {
        this.carMayo = carMayo;
    }

    @Basic
    @Column(name = "CAR_ESPE", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCarEspe() {
        return carEspe;
    }

    public void setCarEspe(double carEspe) {
        this.carEspe = carEspe;
    }

    @Basic
    @Column(name = "CAR_PUBL", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCarPubl() {
        return carPubl;
    }

    public void setCarPubl(double carPubl) {
        this.carPubl = carPubl;
    }

    @Basic
    @Column(name = "COS_DOLL", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCosDoll() {
        return cosDoll;
    }

    public void setCosDoll(double cosDoll) {
        this.cosDoll = cosDoll;
    }

    @Basic
    @Column(name = "TIP_CAMB", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getTipCamb() {
        return tipCamb;
    }

    public void setTipCamb(double tipCamb) {
        this.tipCamb = tipCamb;
    }

    @Basic
    @Column(name = "EXI_MATR", nullable = false, insertable = true, updatable = true)
    public int getExiMatr() {
        return exiMatr;
    }

    public void setExiMatr(int exiMatr) {
        this.exiMatr = exiMatr;
    }

    @Basic
    @Column(name = "EXI_SUCU", nullable = false, insertable = true, updatable = true)
    public int getExiSucu() {
        return exiSucu;
    }

    public void setExiSucu(int exiSucu) {
        this.exiSucu = exiSucu;
    }

    @Basic
    @Column(name = "EXI_ACTU", nullable = false, insertable = true, updatable = true)
    public int getExiActu() {
        return exiActu;
    }

    public void setExiActu(int exiActu) {
        this.exiActu = exiActu;
    }

    @Basic
    @Column(name = "EXI_SUC2", nullable = false, insertable = true, updatable = true)
    public int getExiSuc2() {
        return exiSuc2;
    }

    public void setExiSuc2(int exiSuc2) {
        this.exiSuc2 = exiSuc2;
    }

    @Basic
    @Column(name = "COS_FACT", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCosFact() {
        return cosFact;
    }

    public void setCosFact(double cosFact) {
        this.cosFact = cosFact;
    }

    @Basic
    @Column(name = "COS_NETO", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCosNeto() {
        return cosNeto;
    }

    public void setCosNeto(double cosNeto) {
        this.cosNeto = cosNeto;
    }

    @Basic
    @Column(name = "DES_GRUP", nullable = false, insertable = true, updatable = true, length = 40)
    public String getDesGrup() {
        return desGrup;
    }

    public void setDesGrup(String desGrup) {
        this.desGrup = desGrup;
    }

    @Basic
    @Column(name = "CLA_PROV", nullable = false, insertable = true, updatable = true, length = 5)
    public String getClaProv() {
        return claProv;
    }

    public void setClaProv(String claProv) {
        this.claProv = claProv;
    }

    @Basic
    @Column(name = "UNI_MEDI", nullable = false, insertable = true, updatable = true, length = 1)
    public String getUniMedi() {
        return uniMedi;
    }

    public void setUniMedi(String uniMedi) {
        this.uniMedi = uniMedi;
    }

    @Basic
    @Column(name = "COS_PROM", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCosProm() {
        return cosProm;
    }

    public void setCosProm(double cosProm) {
        this.cosProm = cosProm;
    }

    @Basic
    @Column(name = "PRI_DESC", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getPriDesc() {
        return priDesc;
    }

    public void setPriDesc(double priDesc) {
        this.priDesc = priDesc;
    }

    @Basic
    @Column(name = "SEG_DESC", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getSegDesc() {
        return segDesc;
    }

    public void setSegDesc(double segDesc) {
        this.segDesc = segDesc;
    }

    @Basic
    @Column(name = "TER_DESC", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getTerDesc() {
        return terDesc;
    }

    public void setTerDesc(double terDesc) {
        this.terDesc = terDesc;
    }

    @Basic
    @Column(name = "CAR_FLET", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getCarFlet() {
        return carFlet;
    }

    public void setCarFlet(double carFlet) {
        this.carFlet = carFlet;
    }

    @Basic
    @Column(name = "NUM_PIEZ", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getNumPiez() {
        return numPiez;
    }

    public void setNumPiez(double numPiez) {
        this.numPiez = numPiez;
    }

    @Basic
    @Column(name = "EXI_MINI", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getExiMini() {
        return exiMini;
    }

    public void setExiMini(double exiMini) {
        this.exiMini = exiMini;
    }

    @Basic
    @Column(name = "EXI_MAXI", nullable = false, insertable = true, updatable = true, precision = 0)
    public double getExiMaxi() {
        return exiMaxi;
    }

    public void setExiMaxi(double exiMaxi) {
        this.exiMaxi = exiMaxi;
    }

    @Basic
    @Column(name = "EXI_EFRA", nullable = false, insertable = true, updatable = true)
    public int getExiEfra() {
        return exiEfra;
    }

    public void setExiEfra(int exiEfra) {
        this.exiEfra = exiEfra;
    }

    @Basic
    @Column(name = "EXI_PACO", nullable = false, insertable = true, updatable = true)
    public int getExiPaco() {
        return exiPaco;
    }

    public void setExiPaco(int exiPaco) {
        this.exiPaco = exiPaco;
    }

    @Basic
    @Column(name = "EXI_INIC", nullable = false, insertable = true, updatable = true)
    public int getExiInic() {
        return exiInic;
    }

    public void setExiInic(int exiInic) {
        this.exiInic = exiInic;
    }

    @Basic
    @Column(name = "CONTEO", nullable = false, insertable = true, updatable = true)
    public Date getConteo() {
        return conteo;
    }

    public void setConteo(Date conteo) {
        this.conteo = conteo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CatalogoArticulosEntity that = (CatalogoArticulosEntity) o;

        if (Double.compare(that.preMayo, preMayo) != 0) return false;
        if (Double.compare(that.preEspe, preEspe) != 0) return false;
        if (Double.compare(that.prePubl, prePubl) != 0) return false;
        if (Double.compare(that.carMayo, carMayo) != 0) return false;
        if (Double.compare(that.carEspe, carEspe) != 0) return false;
        if (Double.compare(that.carPubl, carPubl) != 0) return false;
        if (Double.compare(that.cosDoll, cosDoll) != 0) return false;
        if (Double.compare(that.tipCamb, tipCamb) != 0) return false;
        if (exiMatr != that.exiMatr) return false;
        if (exiSucu != that.exiSucu) return false;
        if (exiActu != that.exiActu) return false;
        if (exiSuc2 != that.exiSuc2) return false;
        if (Double.compare(that.cosFact, cosFact) != 0) return false;
        if (Double.compare(that.cosNeto, cosNeto) != 0) return false;
        if (Double.compare(that.cosProm, cosProm) != 0) return false;
        if (Double.compare(that.priDesc, priDesc) != 0) return false;
        if (Double.compare(that.segDesc, segDesc) != 0) return false;
        if (Double.compare(that.terDesc, terDesc) != 0) return false;
        if (Double.compare(that.carFlet, carFlet) != 0) return false;
        if (Double.compare(that.numPiez, numPiez) != 0) return false;
        if (Double.compare(that.exiMini, exiMini) != 0) return false;
        if (Double.compare(that.exiMaxi, exiMaxi) != 0) return false;
        if (exiEfra != that.exiEfra) return false;
        if (exiPaco != that.exiPaco) return false;
        if (exiInic != that.exiInic) return false;
        if (claArti != null ? !claArti.equals(that.claArti) : that.claArti != null) return false;
        if (articulo != null ? !articulo.equals(that.articulo) : that.articulo != null) return false;
        if (claGrup != null ? !claGrup.equals(that.claGrup) : that.claGrup != null) return false;
        if (desArti != null ? !desArti.equals(that.desArti) : that.desArti != null) return false;
        if (numPart != null ? !numPart.equals(that.numPart) : that.numPart != null) return false;
        if (barCode != null ? !barCode.equals(that.barCode) : that.barCode != null) return false;
        if (clase != null ? !clase.equals(that.clase) : that.clase != null) return false;
        if (subclase != null ? !subclase.equals(that.subclase) : that.subclase != null) return false;
        if (depto != null ? !depto.equals(that.depto) : that.depto != null) return false;
        if (barras != null ? !barras.equals(that.barras) : that.barras != null) return false;
        if (fecActu != null ? !fecActu.equals(that.fecActu) : that.fecActu != null) return false;
        if (desGrup != null ? !desGrup.equals(that.desGrup) : that.desGrup != null) return false;
        if (claProv != null ? !claProv.equals(that.claProv) : that.claProv != null) return false;
        if (uniMedi != null ? !uniMedi.equals(that.uniMedi) : that.uniMedi != null) return false;
        if (conteo != null ? !conteo.equals(that.conteo) : that.conteo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = claArti != null ? claArti.hashCode() : 0;
        result = 31 * result + (articulo != null ? articulo.hashCode() : 0);
        result = 31 * result + (claGrup != null ? claGrup.hashCode() : 0);
        result = 31 * result + (desArti != null ? desArti.hashCode() : 0);
        result = 31 * result + (numPart != null ? numPart.hashCode() : 0);
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (depto != null ? depto.hashCode() : 0);
        result = 31 * result + (barras != null ? barras.hashCode() : 0);
        temp = Double.doubleToLongBits(preMayo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(preEspe);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(prePubl);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fecActu != null ? fecActu.hashCode() : 0);
        temp = Double.doubleToLongBits(carMayo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carEspe);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carPubl);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cosDoll);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tipCamb);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + exiMatr;
        result = 31 * result + exiSucu;
        result = 31 * result + exiActu;
        result = 31 * result + exiSuc2;
        temp = Double.doubleToLongBits(cosFact);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cosNeto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (desGrup != null ? desGrup.hashCode() : 0);
        result = 31 * result + (claProv != null ? claProv.hashCode() : 0);
        result = 31 * result + (uniMedi != null ? uniMedi.hashCode() : 0);
        temp = Double.doubleToLongBits(cosProm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(priDesc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(segDesc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(terDesc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carFlet);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numPiez);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(exiMini);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(exiMaxi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + exiEfra;
        result = 31 * result + exiPaco;
        result = 31 * result + exiInic;
        result = 31 * result + (conteo != null ? conteo.hashCode() : 0);
        return result;
    }
}

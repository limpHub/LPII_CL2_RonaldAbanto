package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductoCL2;

	private String descripCL2;

	private String estadoCL2;

	private String nombreCl2;

	private double precioCompraCL2;

	private double precioVentaCL2;

	public TblProductocl2() {
	}

	public int getIdproductoCL2() {
		return this.idproductoCL2;
	}

	public void setIdproductoCL2(int idproductoCL2) {
		this.idproductoCL2 = idproductoCL2;
	}

	public String getDescripCL2() {
		return this.descripCL2;
	}

	public void setDescripCL2(String descripCL2) {
		this.descripCL2 = descripCL2;
	}

	public String getEstadoCL2() {
		return this.estadoCL2;
	}

	public void setEstadoCL2(String estadoCL2) {
		this.estadoCL2 = estadoCL2;
	}

	public String getNombreCl2() {
		return this.nombreCl2;
	}

	public void setNombreCl2(String nombreCl2) {
		this.nombreCl2 = nombreCl2;
	}

	public double getPrecioCompraCL2() {
		return this.precioCompraCL2;
	}

	public void setPrecioCompraCL2(double precioCompraCL2) {
		this.precioCompraCL2 = precioCompraCL2;
	}

	public double getPrecioVentaCL2() {
		return this.precioVentaCL2;
	}

	public void setPrecioVentaCL2(double precioVentaCL2) {
		this.precioVentaCL2 = precioVentaCL2;
	}

}
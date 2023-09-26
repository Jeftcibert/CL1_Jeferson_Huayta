package org.cibecl1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tb_laptop")
public class Laptop {
	@Id
	@Column(name="cod_laptop")
	private int cod_laptop;
	@Column(name="des_laptop")
	private String des_laptop;
	@Column(name="pre_laptop")
	private double pre_laptop;
	@Column(name="sto_laptop")
	private int sto_laptop;
	
	
	private int cod_marca;
	
	
	public int getCod_laptop() {
		return cod_laptop;
	}
	public void setCod_laptop(int cod_laptop) {
		this.cod_laptop = cod_laptop;
	}
	public String getDes_laptop() {
		return des_laptop;
	}
	public void setDes_laptop(String des_laptop) {
		this.des_laptop = des_laptop;
	}
	public double getPre_laptop() {
		return pre_laptop;
	}
	public void setPre_laptop(double pre_laptop) {
		this.pre_laptop = pre_laptop;
	}
	public int getSto_laptop() {
		return sto_laptop;
	}
	public void setSto_laptop(int sto_laptop) {
		this.sto_laptop = sto_laptop;
	}
	public int getCod_marca() {
		return cod_marca;
	}
	public void setCod_marca(int cod_marca) {
		this.cod_marca = cod_marca;
	}

	
}

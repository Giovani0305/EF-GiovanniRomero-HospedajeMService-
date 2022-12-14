package com.idat.HospedajeMService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "detalle_hospedaje")
public class HospedajeDetalle {
	@Id
	private TuristaHospedajeFK fk = new TuristaHospedajeFK();
	
	public TuristaHospedajeFK getFk() {
		return fk;
	}

	public void setFk(TuristaHospedajeFK fk) {
		this.fk = fk;
	}
}

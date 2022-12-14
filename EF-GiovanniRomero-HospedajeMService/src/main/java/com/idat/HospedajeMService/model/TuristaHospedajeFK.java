package com.idat.HospedajeMService.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class TuristaHospedajeFK implements Serializable{
 
	private static final long serialVersionUID = 8440412497853796843L;

	@Column(name = "id_hospedaje", nullable = false)
	private Integer idHospedaje;
	
	@Column(name = "id_turista", nullable = false)
	private Integer idTurista;
	
}

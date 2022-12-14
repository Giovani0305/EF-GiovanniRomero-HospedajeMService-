package com.idat.HospedajeMService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.HospedajeMService.client.OpenFeignClient;
import com.idat.HospedajeMService.dto.TuristaDTO;
import com.idat.HospedajeMService.model.HospedajeDetalle;
import com.idat.HospedajeMService.model.TuristaHospedajeFK;
import com.idat.HospedajeMService.repository.DetalleHospedajeRepository;
 
@Service
public class HospedajeServiceImpl implements HospedajeService{
	@Autowired
	private DetalleHospedajeRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void asignarHospedajeTurista() {
	
		List<TuristaDTO> listado = client.listarTuristas();
		TuristaHospedajeFK fk = null;
		HospedajeDetalle detalle = null;
		
		for (TuristaDTO turistaDTO : listado) {
			fk = new TuristaHospedajeFK();
			fk.setIdTurista(turistaDTO.getCod());
			fk.setIdHospedaje(2);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);			
			detalleRepo.save(detalle);
	   }	
	}
}

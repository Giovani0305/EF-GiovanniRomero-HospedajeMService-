package com.idat.HospedajeMService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.HospedajeMService.service.HospedajeService;
@Controller
@RequestMapping("/api/hospedaje/v1")
public class HospedajeController {
	@Autowired
	private HospedajeService service;
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarHospedajeTurista();
	}
}

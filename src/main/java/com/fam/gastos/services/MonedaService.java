package com.fam.gastos.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fam.gastos.model.Moneda;
import com.fam.gastos.model.repository.MonedaRepository;

@Service
@Transactional
public class MonedaService {

	@Autowired
	private MonedaRepository monedaRepository;
	
	public List<Moneda> findAll(){
		return monedaRepository.findAll();
	}
	
	public void save(Moneda moneda) {
		monedaRepository.save(moneda);
	}
	
	public void delete(Moneda moneda) {
		monedaRepository.delete(moneda);
	}
	
	public Moneda getById(Integer idMoneda) {
		return monedaRepository.getById(idMoneda);
	}
	
	public Boolean existsById(Integer idMoneda) {
		return monedaRepository.existsById(idMoneda);
	}
}

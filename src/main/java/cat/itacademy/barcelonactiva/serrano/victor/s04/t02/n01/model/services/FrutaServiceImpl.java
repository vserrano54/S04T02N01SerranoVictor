package cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n01.model.services;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n01.model.domain.Fruta;
import cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n01.model.repository.FrutaRepository;

@Service
public class FrutaServiceImpl implements FrutaService{

	@Autowired
	
	private FrutaRepository frutaRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Fruta> findAll() {
		
		return frutaRepository.findAll();
	}

	@Override
	@Transactional
	public Fruta save(Fruta fruta) {
		
		return frutaRepository.save(fruta);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		
		frutaRepository.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Fruta> findById(int id) {
		
		return frutaRepository.findById(id);
	}
	
}

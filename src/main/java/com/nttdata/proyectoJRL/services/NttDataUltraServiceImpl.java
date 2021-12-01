package com.nttdata.proyectoJRL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.proyectoJRL.persistence.NttDataUltra;
import com.nttdata.proyectoJRL.persistence.NttDataUltraI;

@Service
public class NttDataUltraServiceImpl implements NttDataUltraServiceI{

	@Autowired
	private NttDataUltraI ultras;
	
	@Override
	public void addUltra(NttDataUltra ultra) {
		ultras.save(ultra);
	}

	@Override
	public void deleteUltra(NttDataUltra ultra) {
		ultras.save(ultra);
	}

	@Override
	public List<NttDataUltra> showUltra() {
		return ultras.findAll();
	}

}

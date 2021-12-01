package com.nttdata.proyectoJRL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.proyectoJRL.persistence.NttDataFight;
import com.nttdata.proyectoJRL.persistence.NttDataFightI;

@Service
public class NttDataFightServiceImpl implements NttDataFightServiceI{

	@Autowired
	private NttDataFightI fights;
	
	@Override
	public void addFight(NttDataFight fight) {
		fights.save(fight);
	}

	@Override
	public void deleteFight(NttDataFight fight) {
		fights.delete(fight);
	}

	@Override
	public List<NttDataFight> showFight() {
		return fights.findAll();
	}

}

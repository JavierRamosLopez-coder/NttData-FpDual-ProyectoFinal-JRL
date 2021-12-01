package com.nttdata.proyectoJRL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.proyectoJRL.persistence.NttDataPlayer;
import com.nttdata.proyectoJRL.persistence.NttDataPlayerI;

@Service
public class NttDataPlayerServiceImpl implements NttDataPlayerServiceI {

	@Autowired
	private NttDataPlayerI players;

	@Override
	public void addPlayer(NttDataPlayer player) {

		players.save(player);

	}

	@Override
	public void deletePlayer(NttDataPlayer player) {

		players.delete(player);

	}

	@Override
	public List<NttDataPlayer> showPlayer() {
		return players.findAll();
	}

	@Override
	public NttDataPlayer findByNameAndFirstSurname(String name, String firstSurname) {
		return players.findByNameAndFirstSurname(name, firstSurname);
	}

}

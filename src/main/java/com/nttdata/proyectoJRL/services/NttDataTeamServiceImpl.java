package com.nttdata.proyectoJRL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.proyectoJRL.persistence.NttDataTeam;
import com.nttdata.proyectoJRL.persistence.NttDataTeamI;

@Service
public class NttDataTeamServiceImpl implements NttDataTeamServiceI{

	@Autowired
	private NttDataTeamI teams;
	
	@Override
	public void addTeam(NttDataTeam team) {
		teams.save(team);
	}

	@Override
	public void deleteTeam(NttDataTeam team) {
		teams.delete(team);
	}

	@Override
	public List<NttDataTeam> showTeam() {
		return teams.findAll();
	}

}

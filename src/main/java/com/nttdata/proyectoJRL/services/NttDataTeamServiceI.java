package com.nttdata.proyectoJRL.services;

import java.util.List;

import com.nttdata.proyectoJRL.persistence.NttDataTeam;

/**
 * 
 * Interfaz NttDataTeamServiceI
 * 
 * @author jramlope
 *
 */
public interface NttDataTeamServiceI {

	/**
	 * Añadido de equipos
	 * @param team
	 */
	public void addTeam(final NttDataTeam team);
	
	/**
	 * Eliminación de equipos
	 * @param team
	 */
	public void deleteTeam(final NttDataTeam team);
	
	/**
	 * Muestra de todos los equipos
	 * @return
	 */
	public List<NttDataTeam> showTeam();
	
}

package com.nttdata.proyectoJRL.services;

import java.util.List;

import com.nttdata.proyectoJRL.persistence.NttDataPlayer;

/**
 * 
 * Interfaz NttDataPlayerServiceI
 * 
 * @author jramlope
 *
 */
public interface NttDataPlayerServiceI {

	/**
	 * Añadido de jugadores
	 * @param player
	 */
	public void addPlayer(final NttDataPlayer player);
	
	/**
	 * Eliminado de jugadores
	 * @param player
	 */
	public void deletePlayer(final NttDataPlayer player);
	
	/**
	 * Muestra de todos los jugadores
	 * @return
	 */
	public List<NttDataPlayer> showPlayer();
	
	/**
	 * Búsqueda de jugador por nombre y primer apellido
	 * @param name
	 * @param firstSurname
	 * @return
	 */
	public NttDataPlayer findByNameAndFirstSurname(final String name, final String firstSurname);
	
}

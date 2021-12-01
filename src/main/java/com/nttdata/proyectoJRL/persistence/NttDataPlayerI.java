package com.nttdata.proyectoJRL.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * Interfaz NttDataPlayerI "vinculada" con la clase NttDataPlayer
 * 
 * @author jramlope
 *
 */
@Repository
public interface NttDataPlayerI extends JpaRepository<NttDataPlayer, Integer> {

	public NttDataPlayer findByNameAndFirstSurname(final String name, final String firstSurname);

}

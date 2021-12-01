package com.nttdata.proyectoJRL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.proyectoJRL.persistence.NttDataFight;
import com.nttdata.proyectoJRL.persistence.NttDataPlayer;
import com.nttdata.proyectoJRL.persistence.NttDataTeam;
import com.nttdata.proyectoJRL.persistence.NttDataUltra;
import com.nttdata.proyectoJRL.services.NttDataFightServiceI;
import com.nttdata.proyectoJRL.services.NttDataPlayerServiceI;
import com.nttdata.proyectoJRL.services.NttDataTeamServiceI;
import com.nttdata.proyectoJRL.services.NttDataUltraServiceI;

@SpringBootApplication
public class NttDataMain implements CommandLineRunner {

	/** Instanciación del servicio de players **/
	@Autowired
	private NttDataPlayerServiceI playerService;

	/** Instanciación del servicio de teams **/
	@Autowired
	private NttDataTeamServiceI teamService;

	/** Instanciación del servicio de ultras **/
	@Autowired
	private NttDataUltraServiceI ultraService;

	/** Instanciación del servicio de fights **/
	@Autowired
	private NttDataFightServiceI fightService;

	public static void main(String[] args) {
		SpringApplication.run(NttDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creación de un objeto de la clase NttDataTeam
		NttDataTeam team2 = new NttDataTeam();
		team2.setCoachName("Marcelino");
		team2.setYearsInCompetition(6);

		teamService.addTeam(team2);

		// Creación de un objeto de la clase NttDataPlayer
		NttDataPlayer player = new NttDataPlayer();

		player.setName("Javier");
		player.setFirstSurname("Ramos");
		player.setSecondSurname("López");
		player.setAge(19);
		player.setScoredGoals(6);
		player.setTeam(team2);

		playerService.addPlayer(player);
		teamService.deleteTeam(team2);

		// Creación de un objeto de la clase NttDataFight
		NttDataFight fight = new NttDataFight();

		fight.setNumOfFighter(1);
		fight.setPlaceOfFight("Real Arena");

		fightService.addFight(fight);
		

		// Creación de un objeto de la clase NttDataUltra
		NttDataUltra ultra = new NttDataUltra();

		ultra.setName("Alonso");
		ultra.setFirstSurname("Ramos");
		ultra.setSecondSurname("López");
		ultra.setTeam(team2);

		ultraService.addUltra(ultra);

	}

}
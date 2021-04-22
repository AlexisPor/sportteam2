package formation.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Team {

	private String nameTeam = "nomTest";
	private int nbPlayer = 20;
	@Autowired
	private List<Coach> listCoachs = new ArrayList<Coach>();

	public Team() {
	}
	
	public Team(String nameTeam, int nbPlayer) {
		this.nameTeam = nameTeam;
		this.nbPlayer = nbPlayer;
	}

	public Team(String nameTeam, int nbPlayer, List<Coach> listCoachs) {
		this.nameTeam = nameTeam;
		this.nbPlayer = nbPlayer;
		this.listCoachs = listCoachs;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public int getNbPlayer() {
		return nbPlayer;
	}

	public void setNbPlayer(int nbPlayer) {
		this.nbPlayer = nbPlayer;
	}

	public List<Coach> getListCoachs() {
		return listCoachs;
	}

	public void setListCoachs(List<Coach> listCoachs) {
		this.listCoachs = listCoachs;
	}

	@Override
	public String toString() {
		return "Team [nameTeam=" + nameTeam + ", nbPlayer=" + nbPlayer + ", listCoachs=" + listCoachs + "]";
	}

}
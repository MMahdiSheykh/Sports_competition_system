package org.maktab.services;

import java.util.List;
import org.maktab.entities.League;
import org.maktab.repositories.LeagueRepository;

public class LeagueService {
    LeagueRepository leagueRepository = new LeagueRepository();

    public void createLeague(League league){
        leagueRepository.createLeague(league);
    }

    public void updateLeagud(League league,int id){
        leagueRepository.updateLeagud(league, id);
    }

    public void deleteLeague(League league){
        leagueRepository.deleteLeague(league);
    }

    public List<League> findAllLeagues(){
        return leagueRepository.findAllLeagues();
    }
}

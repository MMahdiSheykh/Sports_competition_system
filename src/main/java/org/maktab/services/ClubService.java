package org.maktab.services;

import java.util.List;
import org.maktab.entities.Club;
import org.maktab.repositories.ClubRepository;

public class ClubService {
    ClubRepository clubRepository = new ClubRepository();

    public void createClub(Club club){
        clubRepository.createClub(club);
    }

    public void updateClub(Club club,int id){
        clubRepository.updateClub(club, id);
    }

    public void deleteClub(Club club){
        clubRepository.deleteClub(club);
    }

    public List<Club> findAllClub(){
        return clubRepository.findAllClubs();
    }
}

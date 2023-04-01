package org.maktab.entities;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "clubs")
public class Club{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String clubName;
    int numberOfPlayedGames;
    int wins;
    int losses;
    int scores;
}

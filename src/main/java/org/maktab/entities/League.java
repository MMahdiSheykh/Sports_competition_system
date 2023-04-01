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
@Table(name = "leagues")
public class League {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String leagueName;

}

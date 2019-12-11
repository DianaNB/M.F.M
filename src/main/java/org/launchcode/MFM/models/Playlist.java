package org.launchcode.MFM.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Playlist {
    @Id
    @GeneratedValue
    private int id;
}

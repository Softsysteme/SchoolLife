package de.schoollife.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name="dtSubTableView")
public class SubTableView {
     
    private List<Team> teams;
 
    @PostConstruct
    public void init() {
        teams = new ArrayList<Team>();
        Team lakers = new Team("Youri Sylvain", 15.4);
        Team laker = new Team("Mustermann", 15);
        Team lakes = new Team("Mbongo Jeannette", 12);
        Team lakrs = new Team("Malong Bertrang", 8);
        Team laers = new Team("Tangui Junior", 17);
        Team lkers = new Team("Makakeu Angele", 19);
        teams.add(lakers);
        teams.add(laker);
        teams.add(lakrs);
        teams.add(laers);
        teams.add(lkers);
        teams.add(lakes);
         
    }
     
    public List<Team> getTeams() {
        return teams;
    }
}
package de.schoollife.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
public class Team implements Serializable {
 
    private String name;
    private double note;
    
    private List<Stats> stats;
     
    public Team() {
        stats = new ArrayList<Stats>();
    }
     
    public Team(String name, double note) {
        this.name = name;
        this.note = note;
        stats = new ArrayList<Stats>();
    }
 
    
    public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public List<Stats> getStats() {
        return stats;
    }
 
    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }
     
    public int getAllWins() {
        int sum = 0;
         
        for(Stats s : stats) {
            sum += s.getWin();
        }
         
        return sum;
    }
     
    public int getAllLosses() {
        int sum = 0;
         
        for(Stats s : stats) {
            sum += s.getLoss();
        }
         
        return sum;
    }
}
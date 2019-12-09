package com.telusko.DemoHib;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {

//	layer of entity : classname, entity name, table name.
//	if we only want to change the table name, use @Table 
//	if we use @Entity, it changes the entity name, which is 
//	used as a table name, the difference is about to follow:

	@Id
	private int aid;
	private String aname; // Thatpalli NavinkumarReddy BapReddy
	@OneToMany(mappedBy="alien")
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	// name break in to first, middle and last
	// Use Transient to not store the data
	// store a temp data

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", laps=" + laps + "]";
	}


}

package com.affingostore.helpDesk.ticket;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TICKET_PRIORITY")
public class TicketPriority {

	private long IdPriority;
	private String priorityName;
	private Set<Ticket> tickets;
	
	public TicketPriority() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getIdPriority() {
		return IdPriority;
	}
	
	@Column(name="priority_name")
	public String getPriorityName() {
		return priorityName;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="priority")
	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	

	
}

package com.affingostore.helpDesk.ticket;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TICKET_STATUS")
public class TicketStatus {
	
	private long id;
	private String statusName;
	private Set<Ticket> tickets;

	public TicketStatus() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_status_id")
	public long getIdTicketStatus() {
		return id;
	}

	@Column(name="status_name")
	public String getStatusName() {
		return statusName;
	}

	@OneToMany(mappedBy="ticketStatus")
	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
	
	
	
	
}

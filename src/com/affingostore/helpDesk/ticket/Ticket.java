package com.affingostore.helpDesk.ticket;

import java.util.Date;
import java.util.Set;

import javax.annotation.Priority;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.affingostore.helpDesk.message.Message;
import com.affingostore.helpDesk.user.UserSupport;

@Entity
@Table(name="TICKET")
public class Ticket {

	private long ticketId;
	private TicketStatus ticketStatus;
	private Date dateCreated;
	private TicketPriority priority;
	private UserSupport userSupport;
	private String userEmail;
	private String userName;
	
	private Set<Message> messages;

	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_id")
	public long getTicketId() {
		return ticketId;
	}


	@ManyToOne
	@JoinColumn(name="ticket_status_id")
	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	@Column(name="date_created")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateCreated() {
		return dateCreated;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="priority_id")
	public TicketPriority getPriority() {
		return priority;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_support_id")
	public UserSupport getUserSupport() {
		return userSupport;
	}

	@Column(name="user_email")
	public String getUserEmail() {
		return userEmail;
	}

	@Column(name="user_name")
	public String getUserName() {
		return userName;
	}

	@OneToMany(mappedBy="ticket")
	public Set<Message> getMessages() {
		return messages;
	}
	

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setPriority(TicketPriority priority) {
		this.priority = priority;
	}

	public void setUserSupportId(UserSupport userSupport) {
		this.userSupport = userSupport;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
	
	
	
}

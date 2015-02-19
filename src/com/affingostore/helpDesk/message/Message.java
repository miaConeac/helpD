package com.affingostore.helpDesk.message;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.affingostore.helpDesk.ticket.Ticket;
import com.affingostore.helpDesk.user.UserSupport;

@Entity
@Table(name="MESSAGE")
public class Message  implements Serializable{
	

	private Long messageId;
	private Ticket ticket;
	private String body;
	private String subject;
	private UserSupport userSupport;
	private Date dateCreated;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="message_id")
	public Long getMessageId() {
		return messageId;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ticket_id")
	public Ticket getTicket() {
		return ticket;
	}

	public String getBody() {
		return body;
	}

	public String getSubject() {
		return subject;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_support_id")
	public UserSupport getUserSupport() {
		return userSupport;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="date_created",nullable=false)
	public Date getDateCreated() {
		return dateCreated;
	}

	
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setUserSupport(UserSupport userSupport) {
		this.userSupport = userSupport;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

	
	
	
}

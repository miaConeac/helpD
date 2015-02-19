package com.affingostore.helpDesk.user;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.affingostore.helpDesk.ticket.Ticket;

@Entity
@Table(name="USER_SUPPORT")
public class UserSupport {

	private long idUserSupport;
	private String name;
	private String lastName;
	private String email;
	private UserSupportRole role;
	
	private Set<Ticket> tickets;
	
	public static boolean exists() {
		return false;
	}
	public UserSupport() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_user_support")
	public long getIdUserSupport() {
		return idUserSupport;
	}
	
	
	public String getName() {
		return name;
	}
	
	@Column(name="last_name")
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public UserSupportRole getRole() {
		return role;
	}
	
	@OneToMany(mappedBy="userSupport")
	public Set<Ticket> getTickets() {
		return tickets;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setRole(UserSupportRole role) {
		this.role = role;
	}


	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
}

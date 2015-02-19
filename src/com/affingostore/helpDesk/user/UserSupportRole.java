package com.affingostore.helpDesk.user;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.affingostore.helpDesk.message.Message;

@Entity
@Table(name="USER_SUPPORT_ROLE")
public class UserSupportRole {

	private Long roleId;
	private String roleName;
	private Set<Message> messages;
	
	public UserSupportRole() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_role")
	public Long getRoleId() {
		return roleId;
	}
	
	@Column(name="role_name")
	public String getRoleName() {
		return roleName;
	}

	@OneToMany(mappedBy="userSupport")
	public Set<Message> getMessages() {
		return messages;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
	
	
}

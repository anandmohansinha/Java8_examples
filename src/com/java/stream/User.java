package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public  class User {
		private String firstName;
		private String lastName;
		private boolean active;
		private Player player;
		private List<Role> roles = new ArrayList<Role>();
		
		public User(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Player getPlayer() {
			return this.player;
		}
		
		public User player(Player player) {
			this.player = player;
			return this;
		}
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public Role getRole() {
			return this.roles.get(0);
		}
		
		public List<Role> getRoles() {
			return this.roles;
		}
		
		public User role(Role role) {
			this.roles.add(role);
			return this;
		}
		
		public boolean isActive() {
			return this.active;
		}
		
		public User active(boolean active) {
			this.active = active;
			return this;
		}
		
		public String toString() {
			return "User(" + this.firstName + ", " + this.lastName + ")";
		}
	}
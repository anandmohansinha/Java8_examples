package com.java.stream;

public  class Role {
		private String name;
		private Type type;
		
		public Role(Type type) {
			this.type = type;
			this.name = type.name().toLowerCase();
		}
		
		public String getName() {
			return this.name;
		}
		
		public Type getType() {
			return this.type;
		}
		
		public int hashCode() {
			return this.type.hashCode();
		}
		
		public boolean equals(Object other) {
			if (other == null) { return false; }
			else if (other == this) { return true; }
			else if (!(other instanceof Role)) { return false; }
			else { return this.type.equals(((Role) other).type); }
		}
		
		public String toString() {
			return "Role(" + this.type.name() + ")";
		}
		
		public boolean isAdmin() {
			return this.type == Type.ADMIN;
		}
	}
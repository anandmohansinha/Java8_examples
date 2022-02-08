package com.java.stream;

public  class Player {
		private User user;
		private long hits;
		private long atBats;
		private long walks;
		private long strikeouts;
		
		public Player(User user) {
			this.user = user;
			user.player(this);
		}
		
		public User getUser() {
			return this.user;
		}
		
		public String getFirstName() {
			return this.getUser().getFirstName();
		}
		
		public String getLastName() {
			return this.getUser().getLastName();
		}
		
		public long getHits() {
			return this.hits;
		}
		
		public Player hits(long hits) {
			this.hits = hits;
			return this;
		}
		
		public long getAtBats() {
			return this.atBats;
		}
		
		public Player atBats(long atBats) {
			this.atBats = atBats;
			return this;
		}
		
		public long getWalks() {
			return this.walks;
		}
		
		public Player walks(long walks) {
			this.walks = walks;
			return this;
		}
		
		public long getStrikeouts() {
			return this.strikeouts;
		}
		
		public Player strikeouts(long strikeouts) {
			this.strikeouts = strikeouts;
			return this;
		}
		
		public double getAvg() {
			return (double) this.hits / (double) this.atBats;
		}
		
		public String toString() {
			return "Player(" + this.user + ", " + this.getAvg() + ")";
		}
	}
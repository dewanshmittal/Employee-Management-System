package com.moana.model;
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class Adminboss {
		private String name;
		@Id
		private String userid;
		private String password;
		private String email;
		
		
		
		
		public Adminboss(String name, String userid, String password, String email) {
			super();
			this.name = name;
			this.userid = userid;
			this.password = password;
			this.email = email;
		}
		public Adminboss() {
			super();
		}
		
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Adminboss [name=" + name + ", userid=" + userid + ", password=" + password + ", email=" + email + "]";
		}
		

}

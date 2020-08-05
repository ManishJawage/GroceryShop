package in.cg.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
		@Id
		private String customerId;
		@Column
		private String customerPass;
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String customerId, String customerPass) {
			super();
			this.customerId = customerId;
			this.customerPass = customerPass;
		}
		public String getcustomerId() {
			return customerId;
		}
		public void setcustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getcustomerPass() {
			return customerPass;
		}
		public void setcustomerPass(String customerPass) {
			this.customerPass = customerPass;
		}
		
}

package mvc.dataAccessLayer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="user")
	public class UserEntity {
		@Id
		@Column(name = "userid", unique = true)
	    String userId;
			
		@Column(name="first_name") // nullable = false
		String firstName;
		
		@Column(name="last_name")
		String lastName;
		
		@Column(name = "phone_number")
	    String phoneNumber;

	    @Column(name = "email_address")
	    String emailAddress;

	    @Column(name = "date_of_birth")
	     Date dateOfBirth;
	    
	    @Column(name = "password")
	    String password;
	    

	    public String getUserId() {
			return userId;
		}



		public void setUserId(String userId) {
			this.userId = userId;
		}



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public String getPhoneNumber() {
			return phoneNumber;
		}



		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}



		public String getEmailAddress() {
			return emailAddress;
		}



		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}



		public Date getDateOfBirth() {
			return dateOfBirth;
		}



		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		//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
}

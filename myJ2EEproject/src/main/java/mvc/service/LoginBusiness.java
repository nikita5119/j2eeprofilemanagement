package mvc.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserEntity;
import mvc.dataAccessLayer.UserRepository;



@Service
public class LoginBusiness {
	

	@Autowired
	UserRepository ur;
	
	public boolean userLogin(String userid, String pwd) {
		System.out.println("IN SERVICE");
		int result= ur.checkUidPwdInDB(userid, pwd);
		if(result==0) {
			return false;
		} else {
			return true;
		}
		
		}
	
//	public boolean userRegister(String userid, String firstName, String lastName, String phoneNumber,
//            String emailAddress, Date dateOfBirth, String password){
//		System.out.println("in service");
//		UserEntity ue = new UserEntity();
//		ue.setUserId(userid);
//        ue.setFirstName(firstName);
//        ue.setLastName(lastName);
//        ue.setPhoneNumber(phoneNumber);
//        ue.setEmailAddress(emailAddress);
//        ue.setDateOfBirth(dateOfBirth);
//        ue.setPassword(password);
//
//        ur.save(ue);
//        return true;
		
	public boolean register(String userid, String pwd, String first_name, String last_name, String phone_number, String email_address, Date date_of_birth) {
	    System.out.println("in service");
	    UserEntity ue = new UserEntity();
	    ue.setUserId(userid);
	    ue.setPassword(pwd);
	    ue.setFirstName(first_name);  // Set first_name
	    ue.setLastName(last_name); 
	    ue.setEmailAddress(email_address);
	    ue.setPhoneNumber(last_name);
	    ue.setDateOfBirth(date_of_birth);
	    ur.save(ue);
	    return true;
	}
	}


//	
//	
//	
//	     <label for="date_of_birth">Date of Birth:</label>
//<input type="date" id="date_of_birth" name="date_of_birth" required><br> 
//	
//
//}

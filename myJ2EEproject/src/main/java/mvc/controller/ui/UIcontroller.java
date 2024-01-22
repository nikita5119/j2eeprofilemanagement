package mvc.controller.ui;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;
import mvc.service.LoginBusiness;

@Controller
public class UIcontroller {
	
	@Autowired
	LoginBusiness lb;
	
	
	@RequestMapping("/authCheck")
	public String auth(@RequestParam String userid,@RequestParam String password) {
		System.out.println("in controller");
		boolean res=lb.userLogin(userid, password);
		if(res==true)
			return "welcome";
		else
			return "failure";
	}
	
	@RequestMapping("/register")
//	public String reg(@RequestParam String userid, @RequestParam String first_name, @RequestParam String last_name, @RequestParam String phone_number,
//			@RequestParam String email_address, @RequestParam Date date_of_birth,@RequestParam String password) {
//		System.out.println("in controller");
//		boolean res=lb.userRegister(userid, first_name, last_name, phone_number,
//	            email_address, date_of_birth, password);
//		if(res==true)
//			return "welcome";
//		else
//			return "failure";
//	}
//	public String reg(@RequestParam String userid,@RequestParam String password) {
//		System.out.println("in controller");
//		boolean res=lb.register(userid, password);
//		if(res==true)
//			return "success";
//		else
//			return "failure";
//	}
	public String reg(@RequestParam String userid, @RequestParam String password, 
            @RequestParam String first_name, @RequestParam String last_name, @RequestParam String phone_number, @RequestParam String email_address, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date_of_birth ) {
System.out.println("in controller");
boolean res = lb.register(userid, password, first_name, last_name, phone_number, email_address, date_of_birth);
if(res==true)
return "welcome";
else
return "failure";
}
}


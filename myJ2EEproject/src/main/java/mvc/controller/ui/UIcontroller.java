package mvc.controller.ui;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.format.annotation.DateTimeFormat;
import mvc.service.LoginBusiness;





@Controller
@SessionAttributes("username")
public class UIcontroller {
	
	@Autowired
	LoginBusiness lb;
	
	
	@RequestMapping("/authCheck")
	public String auth(@RequestParam String userid,@RequestParam String password, Model model) {
		System.out.println("in controller for login");
		boolean res=lb.userLogin(userid, password);
		if(res==true) {
			model.addAttribute("username", userid); // Pass the username to the model
			return "welcome";}
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
            @RequestParam String first_name, @RequestParam String last_name, @RequestParam String phone_number, @RequestParam String email_address, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date_of_birth, Model model ) {
			 System.out.println("in controller");
			 boolean res = lb.register(userid, password, first_name, last_name, phone_number, email_address, date_of_birth);
				if(res==true) {
					model.addAttribute("username", userid);
					return "welcome";}
				else
					return "failure";
}
	
	@RequestMapping("/changePasswordPage")
	public String changePasswordPage() {
	    return "changePassword"; // Return the view name for the change password page
	}
	
	
	
	
	@RequestMapping("/changePassword")
    public String changePassword(@RequestParam String password,
                                 @RequestParam String newPassword,
                                 @RequestParam String confirmPassword,
                                 RedirectAttributes redirectAttributes,
                                 HttpSession session) {
        System.out.println("in controller in change password");
        String username = (String) session.getAttribute("username");
        boolean passwordChanged = lb.changePassword(username, password, newPassword, confirmPassword);

//        if (passwordChanged) {
//            redirectAttributes.addFlashAttribute("username", username);
//            redirectAttributes.addFlashAttribute("successMessage", "Password changed successfully.");
//            redirectAttributes.addFlashAttribute("errorMessage", ""); // Clear error message
//        } else {
//            redirectAttributes.addFlashAttribute("errorMessage", "Failed to change password. Please check your current password or ensure the new passwords match.");
//            redirectAttributes.addFlashAttribute("successMessage", ""); // Clear success message
//        }

		    return "welcome";
		}
}
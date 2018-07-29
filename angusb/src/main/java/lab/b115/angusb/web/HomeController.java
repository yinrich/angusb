package lab.b115.angusb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome(){
		return "index";
	}
	
	@RequestMapping("/angusb")
	public String getAngusb(){
		return "angusb/angusb";
	}
}

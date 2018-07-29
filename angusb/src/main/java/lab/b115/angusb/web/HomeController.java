package lab.b115.angusb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/angusb")
public class HomeController {

	@RequestMapping("/")
	public String getHome(){
		return "index";
	}
}

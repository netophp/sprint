package netophp.mx.web.controllers;

import javax.servlet.http.HttpSession;

import netophp.mx.service.HelloWorldzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrincipalController {

	@Autowired
	HelloWorldzService helloWorldzService;

	@RequestMapping("/")
	public String principal(Model modelo, HttpSession sesion) {
		modelo.addAttribute("mensaje", helloWorldzService.getHelloWorldz());
		return "principal/index";
	}
}

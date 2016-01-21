package mx.edu.ebc.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	@RequestMapping("/")
	public String principal(Model modelo, HttpSession sesion) {
		return "principal/index";
	}
}

package in.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import in.cg.demo.model.Login;
import in.cg.demo.repository.LoginRepository;

@RestController
public class LoginController {

		@Autowired
		LoginRepository repos;
		
		@PostMapping(path = "/Login/add")
		Login addCredential(@RequestBody Login login) {
			return repos.save(login);
		}

		
		@RequestMapping("/getall")
		public List<Login> getAll()
		{
			return repos.findAll();
		}
}

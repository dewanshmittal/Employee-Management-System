package com.moana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moana.model.Adminboss;



@Controller
public class Admincontroller {
	@Autowired
	servicerepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("addAdmin")
	public String addAdmin(@ModelAttribute("sign") com.moana.model.Adminboss ab) {
		repo.save(ab);
		
		
		return"result";
	}
	
	@RequestMapping("getAdmin")
	public String getAdmin(@RequestParam("userid") String i,Model m) {
		Adminboss ad = repo.findById(i).orElse(new Adminboss("","","", ""));
		m.addAttribute("name",ad.getName());
		m.addAttribute("userid",ad.getUserid());
		m.addAttribute("email",ad.getEmail());
		
		return"result";
	}
	
	@RequestMapping("login")
	public String login(@RequestParam String userid, @RequestParam String password, Model m) {
		Adminboss ad = repo.findById(userid).orElse(new Adminboss("","","", ""));
	
		if(repo.existsByUseridAndPassword(userid,password)) {
			m.addAttribute("res",ad.getName() );
			System.out.println(ad.getName());
			return"dashboard";
			
		}else {
			m.addAttribute("result", "failed");
			return"result";
		}
	}
	
	
	

}

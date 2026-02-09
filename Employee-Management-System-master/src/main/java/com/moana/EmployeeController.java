package com.moana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moana.model.Adminboss;
import com.moana.model.Employees;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@RequestMapping("crEmp")
	public String createEmp(Employees e) {
		
		es.save(e);
		return"result";
	}
	@RequestMapping("getEmp")
	public String getEmp(@RequestParam String eid , Model m) {
		Employees em = es.findById(eid).orElse(new Employees("","","","","",""));
		m.addAttribute("id", em.getEid());
		m.addAttribute("name",em.getEname());
		m.addAttribute("email", em.getEmpemail());
		m.addAttribute("task",em.getTask());
		m.addAttribute("position",em.getPosition());
		
		return"Empdetails";
		
	}
	@RequestMapping("searchforupdate")
	public String searchUpdate(@RequestParam String eid , Model m) {
		
		if(es.existsByEid(eid)) {
			Employees ep = es.findById(eid).orElse(new Employees("","","", "","", ""));
			m.addAttribute("eid", ep.getEid());
			m.addAttribute("ename", ep.getEname());
			m.addAttribute("email", ep.getEmpemail());
			m.addAttribute("password", ep.getPassword());
			m.addAttribute("task", ep.getTask());
			m.addAttribute("position", ep.getPosition());
		
			return"empUpdatepage";
			
		}else {
			m.addAttribute("result", "failed");
			return"result";
		}
		
	}
	@RequestMapping("updateEmp")
	public String updateEmp(@RequestParam String eid,@RequestParam String ename,@RequestParam String empemail,@RequestParam String password,@RequestParam String task,@RequestParam String position) {
		Employees entityToUpdate = es.findById(eid).orElse(new Employees("","","", "","", ""));
		entityToUpdate.setEid(eid);
		entityToUpdate.setEname(ename);
		entityToUpdate.setEmpemail(empemail);
		entityToUpdate.setPassword(password);
		entityToUpdate.setTask(task);
		entityToUpdate.setPosition(position);
		es.save(entityToUpdate);
	
		
		return"updatesuccpage";
		
		
	}
	@RequestMapping("deleteEmp")
	public String deleteEmp(@RequestParam String eid) {
		Employees ep = es.findById(eid).orElse(new Employees("","","", "","", ""));
		es.deleteById(eid);
		return"deletepage";
		
		
	}
	

}

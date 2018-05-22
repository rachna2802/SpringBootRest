package com.example.starterspringrest.Controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.starterspringrest.Service.PersonService;
import com.example.starterspringrest.model.Address;
import com.example.starterspringrest.model.Car;
import com.example.starterspringrest.model.Person;

@Controller

public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/persons",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public @ResponseBody List<Person> getAllPersons(){
		return personService.getAllPersons();
		
	}
	@RequestMapping(value="/persons/{personid}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public @ResponseBody Person getPerson(@PathVariable int personid){
		return personService.getPersonbyId(personid);
		
	}
	@RequestMapping(value="/persons",method=RequestMethod.POST)
	public void addPerson(@RequestBody Person p){
		personService.addPerson(p);
	}
	@RequestMapping(value="/persons/{id}",method=RequestMethod.DELETE)
	public void deletePerson(@PathVariable int personId){
		personService.delete(personId);
	}
	@RequestMapping(value="/persons/{id}",method=RequestMethod.PUT)
	public void updatePerson(@RequestBody Person p,@PathVariable int personId){
		personService.updatePerson(p, personId);
	}
	@RequestMapping(value="/persons/{personid}/address",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public @ResponseBody Address getAddressofPerson(@PathVariable int personid){
		return personService.getAddressofPerson(personid);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/persons/{id}/cars")
	public @ResponseBody List<Car> getCarsforPerson(@PathVariable int id){
		return personService.getCarsforPerson(id);
	}
}

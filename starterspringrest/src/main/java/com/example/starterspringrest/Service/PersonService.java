package com.example.starterspringrest.Service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.example.starterspringrest.model.Address;
import com.example.starterspringrest.model.Car;
import com.example.starterspringrest.model.Person;
@Service
public class PersonService {
	private List<Person> personlist=null;
/*	private List<Person> personlist=Arrays.asList(
			new Person(101, "anuj", 12, new Address(1,11,"linkon street"), null),
			new Person(201, "jay", 12, new Address(2,22,"winson street"), null),
			new Person(301, "poonam", 12, new Address(3,33,"ten street"),null),
			new Person(401, "ritwik", 12, new Address(4,44,"elevens street"),null)
					);*/
	
	
	public PersonService() {
		// TODO Auto-generated constructor stub
		personlist=new ArrayList<Person>();
		List carlist=new ArrayList<Car>();
		carlist.add(new Car("beat","grey","chevrolet"));
		carlist.add(new Car("spark","red","chevrolet"));
		
		personlist.add(new Person(101, "anuj", 12, new Address(1,11,"linkon street"), carlist));
		List carlist1=new ArrayList<Car>();
		carlist1.add(new Car("city","grey","honda"));
		carlist1.add(new Car("crv","red","honda"));
		personlist.add(new Person(201, "anuj", 12, new Address(2,22,"winson street"), carlist1));
		List carlist2=new ArrayList<Car>();
		carlist2.add(new Car("suzuki","grey","maruti"));
		carlist2.add(new Car("esteem","red","maruti"));
		personlist.add(new Person(301, "anuj", 12, new Address(3,33,"ten street"),carlist2 ));
		List carlist3=new ArrayList<Car>();
		carlist3.add(new Car("reva","grey","mahindra"));
		carlist3.add(new Car("zilo","red","mahindra"));
		personlist.add(new Person(401, "anuj", 12, new Address(4,44,"sfd street"), carlist3));
	}
	public List<Person> populateList(){
		personlist=new ArrayList<Person>();
		List carlist=new ArrayList<Car>();
		carlist.add(new Car("beat","grey","chevrolet"));
		carlist.add(new Car("spark","red","chevrolet"));
		
		personlist.add(new Person(101, "anuj", 12, new Address(1,11,"linkon street"), carlist));
		List carlist1=new ArrayList<Car>();
		carlist1.add(new Car("city","grey","honda"));
		carlist1.add(new Car("crv","red","honda"));
		personlist.add(new Person(201, "anuj", 12, new Address(2,22,"winson street"), carlist1));
		List carlist2=new ArrayList<Car>();
		carlist2.add(new Car("suzuki","grey","maruti"));
		carlist2.add(new Car("esteem","red","maruti"));
		personlist.add(new Person(301, "anuj", 12, new Address(3,33,"ten street"),carlist2 ));
		List carlist3=new ArrayList<Car>();
		carlist3.add(new Car("reva","grey","mahindra"));
		carlist3.add(new Car("zilo","red","mahindra"));
		personlist.add(new Person(401, "anuj", 12, new Address(4,44,"sfd street"), carlist3));
		return personlist;
	}
	public List<Person> getAllPersons(){
		
		//List<Person> persons=populateList();
		return personlist; 
		
	}
	public Person getPersonbyId(int personid){
		Person person=null;
		for(Person p:personlist){
			if(p.getPersonId()==personid){
				person=p;
			}
		}
		return person;
		
	} 
	public void addPerson(Person p){

		personlist.add(p);
	}
	
	public void delete(int personid){
		Person person=null;
		for(Person p:personlist){
			if(p.getPersonId()==personid){
				personlist.remove(personid);
				
			}
		}
		
	}
	
	public Address getAddressofPerson(int personId){
		Address add=null;
	
		for(Person p:personlist){
			if(p.getPersonId()==personId){
		
			Address addr=p.getAddress();
			add=addr;
		}
	}
		return add;
	}

	public void updatePerson(Person p,int id){
		
	}
	public List<Car> getCarsforPerson(int id) {
		List<Car> cars=null;
		
		for(Person p:personlist){
			if(p.getPersonId()==id){
		
			List<Car> carlist=p.getCarlist();
			cars=carlist;
		}
	}
		return cars;
	}
	
}

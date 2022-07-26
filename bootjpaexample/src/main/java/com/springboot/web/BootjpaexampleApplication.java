package com.springboot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		//IoC
		ApplicationContext context=SpringApplication.run(
				BootjpaexampleApplication.class, args);
		//DI
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		
		//assigning the values to the constructor -- dataTable object.
		/* --------------------%% 1st data insertion %% -------------------- */
		User user=new User();
		user.setName("Programming");
		user.setCity("Bidar");
		user.setStatus("Quantum Physics");
		/* --------------------%% 2nd data insertion %% -------------------- */
		User userr=new User();
		userr.setName("Sachin Anil");
		userr.setCity("Bangalore");
		userr.setStatus("I am Java Programmer");
		/* --------------------%% 3rd data insertion %% -------------------- */
		User userone=new User();
		userone.setName("Rohit");
		userone.setCity("Mumbai");
		userone.setStatus("RightHand Batsman");
		/* --------------------%% 4th data insertion %% -------------------- */
		User usertwo=new User();
		usertwo.setName("VSLaxman");
		usertwo.setCity("Hydrabad");
		usertwo.setStatus("RightHand Batsman");
		/* --------------------%% 5th data insertion %% -------------------- */
		User userfive=new User();
		userfive.setName("VSLaxman");
		userfive.setCity("Hydrabad");
		userfive.setStatus("RightHand Batsman");
		
		//saving to the repository -- database.
		userRepository.save(user);
		userRepository.save(userr);
		userRepository.save(userone);
		userRepository.save(usertwo);
		userRepository.save(userfive);
		
		
		//read any one record
		List<User> users=List.of(userr,userone,usertwo);
		Iterable<User> result=userRepository.saveAll(users);
		result.forEach(read -> {
			System.out.println(read);
		});
		
		
		//Update the record -- we need to find (Exists)
		Optional<User> optional=userRepository.findById(2);
		User update=optional.get(); // True 
		update.setName("Ms Dhoni"); // setting new name // updation
		update.setCity("Ranchi");
		User displayone=userRepository.save(user);
		System.out.println(displayone);
		
		Optional<User> option=userRepository.findById(4);
		User userin=option.get(); // True 
		user.setName("Yuvraj"); // setting new name // updation
		user.setCity("Punjab");
		user.setStatus("Left Hand Batsaman");
		User display=userRepository.save(userin);
		System.out.println(display);
		
		//How to get the data 
		//findById();
		Iterable<User> itr = userRepository.findAll();
		Iterator<User> iterator=itr.iterator();
		
		while(iterator.hasNext()) 
		{
			User useritr=iterator.next();
			System.out.println(useritr);
		}
		
		//delete the user
		userRepository.deleteById(4);
		System.out.println("Id 15 is been deleted..!");
		userRepository.deleteById(5);
		System.out.println("Id 16 is been deleted..!");

		
//		//delete all 
//		Iterable<User> allusers=userRepository.findAll();
//		allusers.forEach(data->{System.out.println(data);});
//		userRepository.deleteAll(allusers);
//		System.out.println("All the record are wiped..!");
	}
}
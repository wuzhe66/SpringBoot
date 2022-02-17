package com.wuzhe.example.api;

import java.util.concurrent.atomic.AtomicLong;

import com.wuzhe.example.model.Address;
import com.wuzhe.example.model.Employee;
import com.wuzhe.example.model.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/test")
	public Employee employee() {
		return new Employee(1,"Evan",new Address(13,"Rosemonde","LA"));
	}

	// http://localhost:8080/testemployee?number=33&firstname=brad
	@GetMapping("/testemployee")
	public Employee testRequestParam(@RequestParam(value = "number") int id,
									 @RequestParam(value = "firstname") String name) {
		return new Employee(id,name,new Address(44,"123","Kirkland"));
	}

	@PostMapping("/testemployee")
	//	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String creatPerson(@RequestBody Employee stuff){
		System.out.println(stuff);
		return "New Stuff is created";
	}

}

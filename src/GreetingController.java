import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

		private static final String template = "Hello, %!";
		private final AtomicLong counter = new AtomicLong();
		
		@GetMapping("/greeting")
		public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
			Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
			return greeting;
		}

}
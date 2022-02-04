package springazure.com.example.springazure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Application {
    @GetMapping("/message")
	public String wish()
	{
		return "Congrats !!! Hello Madhuri from Spring ";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

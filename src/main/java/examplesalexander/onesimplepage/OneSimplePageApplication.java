package examplesalexander.onesimplepage;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OneSimplePageApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneSimplePageApplication.class, args);
	}

}

@RestController
class SimpleController {
    
    @RequestMapping("/")
    @ResponseBody
    public String hello(@RequestParam int x, @RequestParam int y) {
    	int sum = x+y;
    	
    	 return "<h1>Hello!</h1><br>"
    	 		+ "Suma >>> "+sum;
    	 
    }
}
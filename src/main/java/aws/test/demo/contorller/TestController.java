package aws.test.demo.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "변경완료";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "변경완료1";
	}
}

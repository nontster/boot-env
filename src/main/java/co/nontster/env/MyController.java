package co.nontster.env;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private VCloudConfigurationProperties config;

	public MyController(VCloudConfigurationProperties config) {
		super();
		this.config = config;
	}
	
	@RequestMapping("/")
	public String home(){
		return config.url;
	}
}

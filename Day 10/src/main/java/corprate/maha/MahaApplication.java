package corprate.maha;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import corprate.maha.dto.request.RegisterRequest;
import corprate.maha.enumerated.Role;
import corprate.maha.service.UserService;

@SpringBootApplication
public class MahaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MahaApplication.class, args);
	}


	// @Bean
	// public CommandLineRunner commandLineRunner(UserService userService)
	// {
	// 	return args->{
	// 		var user=RegisterRequest.builder()
	// 		.name("Admin")
	// 		.email("admin@gmail.com")
	// 		.role(Role.USER)
	// 		.password("Admin@123")
	// 		.build();
	// 		userService.register(user);
	// 	};
	// }

}

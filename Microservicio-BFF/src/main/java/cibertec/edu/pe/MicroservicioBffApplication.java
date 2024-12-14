package cibertec.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicioBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioBffApplication.class, args);
	}

}

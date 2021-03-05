package github.donghoonkhan.rabbitmq.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RabbitMqManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqManagerApplication.class, args);
	}

}

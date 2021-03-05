package github.donghoonkhan.rabbitmq.manager.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import github.donghoonkhan.rabbitmq.manager.model.RabbitMqQueue;

@FeignClient(value = "rabbitMqFeignClient", 
            url = "${spring.rabbitmq.host}" + ":" + "${spring.rabbitmq.managementPort}",
            path = "/api")
public interface RabbitMqFeignClient {
    
    @GetMapping("/queues")
    List<RabbitMqQueue> getQueues();
}

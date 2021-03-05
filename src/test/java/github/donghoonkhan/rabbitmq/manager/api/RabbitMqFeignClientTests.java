package github.donghoonkhan.rabbitmq.manager.api;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import github.donghoonkhan.rabbitmq.manager.AbstractIntegrationTestWithRabbitMq;
import github.donghoonkhan.rabbitmq.manager.model.RabbitMqQueue;

public class RabbitMqFeignClientTests extends AbstractIntegrationTestWithRabbitMq {
    
    @Autowired
    private RabbitMqFeignClient rabbitMqFeignClient;

    @Test
    void shouldGetAllQueues() {
        List<RabbitMqQueue> queues = rabbitMqFeignClient.getQueues();
        assertTrue(queues.isEmpty());
    }
}

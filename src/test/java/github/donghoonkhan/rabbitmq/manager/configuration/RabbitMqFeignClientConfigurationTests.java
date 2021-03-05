package github.donghoonkhan.rabbitmq.manager.configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import github.donghoonkhan.rabbitmq.manager.AbstractIntegrationTest;

public class RabbitMqFeignClientConfigurationTests extends AbstractIntegrationTest {
    
    @Autowired
    private RabbitMqFeignClientConfiguration rabbitFeignConfiguration;

    @Test
    void shouldReadProperties() {
        assertEquals("guest", rabbitFeignConfiguration.getUsername());
        assertEquals("guest", rabbitFeignConfiguration.getPassword());
    }
}

package github.donghoonkhan.rabbitmq.manager;

import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@ContextConfiguration(initializers = {AbstractIntegrationTestWithRabbitMq.Initializer.class})
public class AbstractIntegrationTestWithRabbitMq extends AbstractIntegrationTest {
    
    private static final int MANAGEMENT_HTTP_PORT = 15672;
    private static final int AMQP_PORT = 5672;

    @Container
    public static GenericContainer<?> rabbitMqContainer = new GenericContainer<>("rabbitmq:3.8-management-alpine").withExposedPorts(MANAGEMENT_HTTP_PORT, AMQP_PORT);

    static class Initializer
            implements ApplicationContextInitializer<ConfigurableApplicationContext> {
        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            TestPropertyValues.of(
                    "spring.rabbitmq.port=" + rabbitMqContainer.getMappedPort(AMQP_PORT),
                    "spring.rabbitmq.managementPort=" + rabbitMqContainer.getMappedPort(MANAGEMENT_HTTP_PORT)
            ).applyTo(configurableApplicationContext.getEnvironment());
        }
    }
}

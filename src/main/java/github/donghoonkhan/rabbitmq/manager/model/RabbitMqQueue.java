package github.donghoonkhan.rabbitmq.manager.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RabbitMqQueue {

    private String name;
    private String vhost;
}

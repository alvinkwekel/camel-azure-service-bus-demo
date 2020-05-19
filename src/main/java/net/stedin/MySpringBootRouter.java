package net.stedin;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MySpringBootRouter extends RouteBuilder {

    public void configure() {
        from("timer:myTimer").routeId("sender")
                .setBody(constant("bla"))
                .to("jms:myQueue");

        from("jms:myQueue").routeId("receiver")
                .to("stream:out");
    }
}

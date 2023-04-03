package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class MyRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo?period={{timer.period}}&delay={{timer.delay}}")
                .log("Hello! I'm running #ApacheCamel & #Quarkus on Microhsift");
    }
}

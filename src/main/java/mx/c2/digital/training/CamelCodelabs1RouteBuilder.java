package mx.c2.digital.training;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class CamelCodelabs1RouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://{{camel.codelabs1.input.folder}}").routeId("MainRoute")
                .log(LoggingLevel.INFO,"{body}")
                .to("file://{{camel.codelabs1.output.folder}}");
    }
}

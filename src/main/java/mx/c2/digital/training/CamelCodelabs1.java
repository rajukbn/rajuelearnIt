package mx.c2.digital.training;

import org.apache.camel.CamelContext;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelCodelabs1 {
    public static void main(String args[])throws Exception{
        CamelContext context = new DefaultCamelContext();
        try {
            PropertiesComponent pc = new PropertiesComponent();
            pc.setLocation("classpath:camel-codelabs1.properties");
            context.addComponent("properties",pc);
            context.addRoutes(new CamelCodelabs1RouteBuilder());
            context.start();
            Thread.sleep(6000);
        }finally {
            context.stop();
        }
    }
}

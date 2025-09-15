package com.brotherhood.demo.routes.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimeRouter extends RouteBuilder {

    @Autowired
    private GetCurrentTimeBean gtb;

    @Override
    public void configure() {

        from("timer:first-timer")
        .bean(gtb)
        .to("log:first-timer");

    }

}
@Component
class GetCurrentTimeBean{

    public String getCurrentTime()
    {
        return "Time Now is " + LocalDateTime.now();
    }

    
}


    



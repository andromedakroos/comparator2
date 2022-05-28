package com.comparator.comparator.Counter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestCounterController {
    @RequestMapping(value = "/counter", method = RequestMethod.GET, produces = "application/json")
    public int getCounter() {
        return RequestCounter.getRequestsCount();
    }
}
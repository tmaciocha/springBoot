package com.tmaci.springBootApp;

    import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ToLearnController {


    @RequestMapping("/toLearn")
    public List<ToLearn> toLearnList() {
        return Arrays.asList(
                new ToLearn(1,"Learn Microservices", "Youtube"),
                new ToLearn(2,"Spring Security", "Udemy")

        );
    }
}

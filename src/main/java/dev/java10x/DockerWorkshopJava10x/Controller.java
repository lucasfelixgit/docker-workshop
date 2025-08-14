package dev.java10x.DockerWorkshopJava10x;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/docker")
    public String dockerMessage() {
        return "This is a Docker Application.";
    }

}

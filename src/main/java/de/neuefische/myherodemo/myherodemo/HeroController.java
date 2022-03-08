package de.neuefische.myherodemo.myherodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetthehero")
public class HeroController {
    @GetMapping("/{name}/")
    public String greet(@PathVariable String name) {
        return "Hallo " + name;
    }
}
package myProject.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author paveldikin
 * @date 25.06.2020
 */
@RestController
public class Controller {

    @GetMapping("/get")
    public Object greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return name;
    }




}

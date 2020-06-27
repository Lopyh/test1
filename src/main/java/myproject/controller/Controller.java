package myproject.controller;

import myproject.model.BadStatus;
import myproject.model.Branches;
import myproject.repository.MyCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author paveldikin
 * @date 25.06.2020
 */
@RestController
public class Controller {

    @Autowired
    MyCrudRepository repository;

    String status = "branch not found";

    @GetMapping("/branches/{id}")
    public ResponseEntity greeting(@PathVariable Long id) {
        System.out.println("get branches id = " + id);
        if (id != null){
            Branches branches = repository.findBranchesById(id);
            if (branches != null){
                return ResponseEntity.ok(branches);
            }
        }
        return ResponseEntity.badRequest().body(new BadStatus());
    }




}

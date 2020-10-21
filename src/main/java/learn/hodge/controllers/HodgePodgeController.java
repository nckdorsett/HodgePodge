package learn.hodge.controllers;

import learn.hodge.models.SheepValue;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HodgePodgeController {

    static int sheepCount = 0;

    @GetMapping("/{name}")
    public String getName(@PathVariable String name) {
        return "your name " + name;
    }

    @GetMapping("/current/time")
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name) {
        return "Hello, " + name;
    }

    @PutMapping("/sheep")
    public void putSheep() {
        sheepCount++;
        System.out.println(sheepCount);
    }

    @GetMapping("/sheep")
    public int getSheepCount() {
        return sheepCount;
    }

    @PutMapping("/sheep/{amount}")
    public void increaseSheep(@PathVariable int amount) {
        sheepCount = sheepCount + amount;
    }

    @PostMapping("/sheep")
    public void postSheep(@RequestBody SheepValue sheepValue){
        sheepCount = sheepCount + sheepValue.getAmount();
    }

}

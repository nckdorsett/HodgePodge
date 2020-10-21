package learn.hodge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

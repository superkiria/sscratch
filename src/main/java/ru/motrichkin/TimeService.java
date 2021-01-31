package ru.motrichkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/time")
public class TimeService {

    static private int count = 0;

    @GetMapping
    String getTime() {
        count++;
        return (new Date()).toString() + ": " + count + "\n";
    }
}

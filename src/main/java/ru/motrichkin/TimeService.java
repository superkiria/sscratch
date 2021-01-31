package ru.motrichkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/time")
public class TimeService {
    @GetMapping
    String getTime() {
        return (new Date()).toString();
    }
}

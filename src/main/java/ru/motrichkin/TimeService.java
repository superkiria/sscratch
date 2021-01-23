package ru.motrichkin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TimeService {
    @RequestMapping("/time")
    String getTime() {
        return (new Date()).toString();
    }
}

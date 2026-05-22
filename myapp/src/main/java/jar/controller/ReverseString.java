package jar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ReverseString {

    @GetMapping("/api/reverse")
    public String reverse(@RequestParam String text) {

        return new StringBuilder(text).reverse().toString();
    }
}
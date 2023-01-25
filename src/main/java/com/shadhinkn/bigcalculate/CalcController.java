package com.shadhinkn.bigcalculate;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CalcController {
    @GetMapping
    public ResponseEntity<String> calculate(){
        return ResponseEntity.ok("Hello Shadhin this is working!");
    }
}

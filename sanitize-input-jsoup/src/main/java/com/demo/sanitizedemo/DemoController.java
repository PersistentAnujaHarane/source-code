package com.demo.sanitizedemo;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @RequestMapping("/get")
    String get(){
        return "hello";
    }

    @PostMapping("/post")
    String validateInput(@RequestBody String data){
        String validated= Jsoup.clean(data, Whitelist.none());
        return validated;

    }
    @PostMapping("/validate")
    public ResponseEntity<?> submitUserData(
            @RequestBody Map<String, Object> userInput)
    {
        String validated=null;
        for (Map.Entry<String, Object> entry : userInput.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
            Object obj=entry.getValue();
            validated= Jsoup.clean(obj.toString(), Whitelist.none().removeTags("<b>"));
            System.out.println(validated);
        }

        return new ResponseEntity<String>(validated, HttpStatus.OK);

    }

}

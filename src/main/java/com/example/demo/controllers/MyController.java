package com.example.demo.controllers;


import com.example.demo.DemoApplication;
import com.example.demo.services.CatFact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String welcome() {

        return "Welcome to CatFacts";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingleFact() throws IOException {

        CatFact singleFact = new CatFact();

        return singleFact.getCatData().toString();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public ArrayList<CatFact> getTenFacts() throws IOException {

        CatFact tenFacts = new CatFact();

        ArrayList<CatFact> ten = new ArrayList<CatFact>();

        for (int i = 0; i <= 10; i++) {
            ten.add(tenFacts);
        }

        return ten;
    }
}

package com.example.demo.controllers;


import com.example.demo.DemoApplication;
import com.example.demo.services.CatFact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public ArrayList<CatFact> getTenFactsSortByDate() throws IOException {

        CatFact tenFacts = new CatFact();

        ArrayList<CatFact> ten = new ArrayList<CatFact>();

        for (int j = 0; j <= 10; j++) {
            ten.add(tenFacts);
        }

        Collections.sort(ten);

        return ten;
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getContains(@RequestParam char character, int amount) throws IOException {

        CatFact containedFact = new CatFact();

        char someChar = character;
        int count = 0;

        for (int k = 0; k < containedFact.toString().length(); k++) {
            if (containedFact.toString().charAt(k) == someChar) {
                count++;
            }
        }

        if (count >= amount) {
            return containedFact.getCatData().toString();
        }

            return "Sorry no luck";
    }

}

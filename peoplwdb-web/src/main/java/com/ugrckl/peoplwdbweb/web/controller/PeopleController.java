package com.ugrckl.peoplwdbweb.web.controller;

import com.ugrckl.peoplwdbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model){
        List<Person> people = List.of(
                new Person("Jake","Snake", "jake_snake@gmail.com","+905326234531", LocalDate.of(1970,1,1)),
                new Person("Sarah","Smith", "sarah_smith@gmail.com","+905326234532", LocalDate.of(1980,5,1)),
                new Person("Johnny","Jackson", "jnjk@gmail.com","+905326234533",LocalDate.of(1995,3,1)),
                new Person("Ugur","Cakil", "ugrckl@gmail.com","+905326234534", LocalDate.of(1990,6,1)),
                new Person("Bobby","Kim", "bobkim@gmail.com" ,"+905326234535", LocalDate.of(1960,8,1))

        );
        model.addAttribute("people",people);
        return "people";
    }
}

package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form

    @RequestMapping("/movie")
    public String showMovie() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processMovieName")
    public String processMovieName(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String theMovie = request.getParameter("movieName");

        //create message
        String welcomeMessage = "Welcome to the Software Engineering Class";
        String movieResult = "Moviename: " + theMovie;
        String favoriteResult = theMovie + " is my favorite movie";

        // add message to the model
        model.addAttribute("welcome", welcomeMessage);
        model.addAttribute("movieName", movieResult);
        model.addAttribute("favoriteMovie", favoriteResult);
        return "helloworld";
    }

}









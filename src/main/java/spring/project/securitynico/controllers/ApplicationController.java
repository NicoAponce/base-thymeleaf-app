package spring.project.securitynico.controllers;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@RequestMapping("/api")public class ApplicationController {    @GetMapping("/test")    public String test(){        return "API Test ";    }}
package peaksoft.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.service.CompanyService;

@Controller
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {


    private final CompanyService companyService;


    @GetMapping
    public String getAllCompany(){
        return "/companies";

    }



}

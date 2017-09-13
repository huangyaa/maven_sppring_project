package test.com.controller;

import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import test.com.entity.Person;
import test.com.service.HelloService;

@Controller
@RequestMapping("/maven")
public class HelloController {
	@Resource
	protected HelloService helloService;
	
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
 
        model.addAttribute("message", "Spring3 MVC");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "/index";
    }
    
    @RequestMapping(value="/person",method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson() {
 
        Person person = new Person();
        person = helloService.getEntity("1");
        return person;
    }
}
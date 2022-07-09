package app;

import data.Auta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repo.AutaRepo;

@RestController
public class ServletController {
    @Autowired
    AutaRepo auta;


    @RequestMapping(
            value="/hello",
            method= RequestMethod.GET
    )
    public String hello(){
        return "hello";
    }

    @RequestMapping(
            value="/find",
            method= RequestMethod.GET
    )
    public Integer find(){
        return auta.findBynazwa("bmw").get(0).getPredkosc();
    }
}

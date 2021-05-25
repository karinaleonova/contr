package boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @RequestMapping(method = RequestMethod.GET,value = "/test/{id}/hello")
    public String getInfo(@PathVariable(value = "id") long id ,
                          @RequestParam(value = "name") String name ,
                          @RequestParam(value = "age") int age){

        return "Version is : " + id + " , Name is : " + name + " , Age is : " + age;
    }
}

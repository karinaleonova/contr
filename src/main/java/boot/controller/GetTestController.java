package boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetTestController {

    @RequestMapping(method = RequestMethod.GET,value = "/test/{version}/hello")
    public String getInfo(@PathVariable(value = "version") String version,
                          @RequestParam(value = "name") String name ,
                          @RequestParam(value = "age") int age){

        return "Version is : " + version + " , Name is : " + name + " , Age is : " + age;
    }
}

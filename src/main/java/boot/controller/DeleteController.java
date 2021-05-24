package boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    @RequestMapping(value = "/test/delete/hello", method = RequestMethod.DELETE)
    public String deleteInfo(){

        return "Delete";
    }
}

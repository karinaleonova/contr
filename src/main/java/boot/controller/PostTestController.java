package boot.controller;

import boot.stud.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostTestController {

    @RequestMapping(value = "/test/post/hello" , method = RequestMethod.POST, consumes = "application/json")
    public String postInfo(@RequestBody Student student){
        return "Student Name is : " + student.getName() + ", Age : " + student.getAge();
    }
}

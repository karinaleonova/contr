package boot.controller;

import boot.stud.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class PutTestController {

    @RequestMapping(value = "/test/{name}/{age}/put/hello", method = RequestMethod.PUT)
    public String putInfo(@PathVariable(value = "name") String name,
                          @PathVariable(value = "age") int age){

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return " New Student name :" + student.getName() + " , Age : " + student.getAge();
    }
}
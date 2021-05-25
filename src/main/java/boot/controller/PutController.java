package boot.controller;

import boot.stud.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class PutController {

    @RequestMapping(value = "/test/{name}/{age}/put/hello", method = RequestMethod.PUT)
    public String putInfo(@RequestBody Student student,
            @PathVariable(value = "name") String name,
                          @PathVariable(value = "age") int age){

        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setAge(age);
        String oldStudent = "Student had name: "+ student.getName() +" and Age:" + student.getAge();
        return oldStudent + " New Student name :" + newStudent.getName() + " , Age : " + newStudent.getAge();
    }
}
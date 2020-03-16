package SpringRestDemo.rest;

import SpringRestDemo.error.StudentNotFoundException;
import SpringRestDemo.entity.Student;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController 
{
    private List<Student> theStudents;
    
    //only loaded once
    @PostConstruct
    public void loadData()
    {
        theStudents = new ArrayList<>();
        
        theStudents.add(new Student("Adi", "Ksh"));
        theStudents.add(new Student("Aditya", "Kshettri"));
        theStudents.add(new Student("Sri", "Nidhi"));
    }
    
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return theStudents;
    }
    
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        if(studentId>=theStudents.size() || studentId<0){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}

package th.ac.mahidol.ict.final2020;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ICTController {
    @GetMapping("/students")
    public @ResponseBody
    List<Student> getStudents() {
        // fill in your code here
    }

    @GetMapping("/teachers")
    public @ResponseBody
    List<Teacher> getTeachers() {
        // fill in your code here
    }
}

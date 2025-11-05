package SPringStudent.Stumange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class En21Controller {

    @Autowired
    private En21Service en21Service;

    // POST: Create student
    @PostMapping
    public En21 createStudent(@RequestBody En21 student) {
        return en21Service.saveStudent(student);
    }

    // GET: All students
    @GetMapping
    public List<En21> getAllStudents() {
        return en21Service.getAllStudents();
    }

    // GET: Single student by ID
    @GetMapping("/{id}")
    public En21 getStudentById(@PathVariable Long id) {
        return en21Service.getStudentById(id);
    }

    // PUT: Update student
    @PutMapping("/{id}")
    public En21 updateStudent(@PathVariable Long id, @RequestBody En21 updatedStudent) {
        return en21Service.updateStudent(id, updatedStudent);
    }

    // DELETE: Delete student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        en21Service.deleteStudent(id);
    }
}
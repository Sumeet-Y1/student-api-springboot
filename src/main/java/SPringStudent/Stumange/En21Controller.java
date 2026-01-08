package SPringStudent.Stumange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class En21Controller {

    @Autowired
    private En21Service en21Service;

    // POST: Create student (now requires userId)
    @PostMapping
    public En21 createStudent(@RequestBody En21 student, @RequestParam Long userId) {
        student.setUserId(userId);
        return en21Service.saveStudent(student);
    }

    // GET: Get students by userId
    @GetMapping
    public List<En21> getStudentsByUser(@RequestParam Long userId) {
        return en21Service.getStudentsByUserId(userId);
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
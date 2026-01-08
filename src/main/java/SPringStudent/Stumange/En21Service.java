package SPringStudent.Stumange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class En21Service {

    @Autowired
    private En21Repository en21Repository;

    public En21 saveStudent(En21 student) {
        return en21Repository.save(student);
    }

    // Get all students for a specific user
    public List<En21> getStudentsByUserId(Long userId) {
        return en21Repository.findByUserId(userId);
    }

    public List<En21> getAllStudents() {
        return en21Repository.findAll();
    }

    public En21 getStudentById(Long id) {
        return en21Repository.findById(id).orElse(null);
    }

    public En21 updateStudent(Long id, En21 updatedStudent) {
        En21 student = en21Repository.findById(id).orElse(null);
        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setAge(updatedStudent.getAge());
            return en21Repository.save(student);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        en21Repository.deleteById(id);
    }
}
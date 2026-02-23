import java.util.List;

interface StudentRepository {
    void save(StudentRecord student);
    int count();
    List<StudentRecord> findAll();
}
package gr.aueb.cf.cf9.ch15.schoolApp;

/**
 * Provides common CRUD operations for Teachers
 */
public interface ITeacherService {

    void addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void removeTeacher(long id);

    Teacher getTeacherById(long id);

    Teacher[] getAllTeachers();
}

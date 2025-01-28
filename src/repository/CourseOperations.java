package repository;

import model.Course;

import java.util.List;

public interface CourseOperations {
    String createCourse(Course course);

    Course getCourseById(Integer id);

    List<Course> getAllCourses();

    String updateCourse(Integer id, Course course);

    String deleteCourse(Integer id);
}

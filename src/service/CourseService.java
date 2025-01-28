package service;

import model.Course;
import repository.CourseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService implements CourseOperations {
    private final List<Course> courseDatabase = new ArrayList<>();

    @Override
    public String createCourse(Course course) {
        courseDatabase.add(course);
        return "Course successfully added!";
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseDatabase.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDatabase;
    }

    @Override
    public String updateCourse(Integer id, Course updatedCourse) {
        Optional<Course> existingCourse = courseDatabase.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst();
        if (existingCourse.isPresent()) {
            Course course = existingCourse.get();
            course.setName(updatedCourse.getName());
            course.setDescription(updatedCourse.getDescription());
            course.setPrice(updatedCourse.getPrice());
            return "Course successfully updated!";
        }
        return "Course not found!";
    }

    @Override
    public String deleteCourse(Integer id) {
        boolean removed = courseDatabase.removeIf(course -> course.getId().equals(id));
        return removed ? "Course successfully deleted!" : "Course not found!";
    }
}

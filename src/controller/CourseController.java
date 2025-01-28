package controller;

import model.Course;
import service.CourseService;

import java.util.List;

public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    public void createCourse(Course course) {
        String result = courseService.createCourse(course);
        System.out.println(result);
    }
    public void getCourseById(Integer id) {
        Course course = courseService.getCourseById(id);
        if (course != null) {
            System.out.println(course);
        } else {
            System.out.println("Course not found!");
        }
    }
    public void getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        courses.forEach(System.out::println);
    }

    public void updateCourse(Integer id, Course updatedCourse) {
        String result = courseService.updateCourse(id, updatedCourse);
        System.out.println(result);
    }

    public void deleteCourse(Integer id) {
        String result = courseService.deleteCourse(id);
        System.out.println(result);
    }


}

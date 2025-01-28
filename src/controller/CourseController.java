package controller;

import model.Course;
import service.CourseService;

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

}

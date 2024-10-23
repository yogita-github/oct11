package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseDao {

boolean save(Course c);

Map<String, Course> findAll();

boolean removeByName(String cname);

boolean updateByName(String cname, int cduration, int capacity);

List<Course> getByDuration(int cduration);

Map<String, Course> sortByName();

List<Course> sortByDuration();

}

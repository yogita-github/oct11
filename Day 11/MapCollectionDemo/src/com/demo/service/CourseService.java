package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseService {

	boolean addnewcourse();

	Map<String, Course> getAll();

	boolean deleteByName(String cname);

	boolean modifyByName(String cname, int cduration, int capacity);

	List<Course> findByDuration(int cduration);

	Map<String, Course> sortByName();

	List<Course> sortByDuration();

}

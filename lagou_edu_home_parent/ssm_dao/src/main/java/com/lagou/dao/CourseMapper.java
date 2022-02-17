package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface CourseMapper {

    // 多条件课程列表查询
    public List<Course> findCourseByCondition(CourseVO courseVO);

    // 课程新增
    public void saveCourse(Course course);

    // 讲师新增
    public void saveTeacher(Teacher teacher);

    // 根据ID获取课程及老师信息
    public CourseVO findCourseById(Integer id);

    // 修改课程信息
    public void updateCourse(Course course);

    // 修改讲师信息
    public void updateTeacher(Teacher teacher);

    // 课程状态管理
    public void updateCourseStatus(Course course);

}

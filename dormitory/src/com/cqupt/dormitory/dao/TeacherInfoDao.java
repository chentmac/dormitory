package com.cqupt.dormitory.dao;

import com.cqupt.dormitory.model.Teacher;

/**
 * 教师信息的DAO接口
 * @author Bern
 *
 */
public interface TeacherInfoDao {
	/**
	 * 根据教师名字学院id查找教师
	 * @param name 教师名字
	 * @return 教师信息
	 */
	public Teacher findTeacherByNameAndAcademyId(String name, int academyId);
	
	/**
	 * 根据教师的账号和密码查找教师
	 * @param teacher 教师的num和pw不能为空
	 * @return 教师信息
	 */
	public Teacher findTeacherByNumAndPw(Teacher teacher);
	
}
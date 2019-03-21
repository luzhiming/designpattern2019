/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 老师角色
 */
public class Teacher {
    // 老师管理的学生列表
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        if (student == null) {
            return;
        }
        students.add(student);
    }

    // 老师开始讲课: 1+1=2
    public void teachKnowledge() {
        for (Student student : students) {
            student.receiveKnowledge("1+1=2");
        }
    }
}
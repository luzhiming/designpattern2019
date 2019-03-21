/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        StudentA studentA = new StudentA("学生A");
        StudentB studentB = new StudentB("学生B");
        StudentC studentC = new StudentC("学生C");
        StudentH studentH = new StudentH("学生H");
        teacher.addStudent(studentA);
        teacher.addStudent(studentB);
        teacher.addStudent(studentC);
        teacher.addStudent(studentH);
        teacher.teachKnowledge();
    }
}

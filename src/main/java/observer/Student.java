/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

/**
 * 抽象的学生组件
 */
public abstract class Student {
    // 学生的名字
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // 学生接收到老师的 知识
    public void receiveKnowledge(String knowledge) {
        System.out.println("我的名字是:" + name + " 老师讲的知识是:" + knowledge);
        learn(knowledge);
    }

    // 学生自己的理解
    public abstract void learn(String knowledge);
}

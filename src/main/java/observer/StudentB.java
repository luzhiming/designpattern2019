/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

public class StudentB extends Student {
    public StudentB(String name) {
        super(name);
    }

    public void learn(String knowledge) {
        System.out.println("我睡着了...");
    }
}

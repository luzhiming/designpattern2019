/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

public class StudentC extends Student {
    public StudentC(String name) {
        super(name);
    }

    public void learn(String knowledge) {
        System.out.println("1+1为啥等于2");
    }
}

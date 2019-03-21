/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

public class StudentA extends Student {
    public StudentA(String name) {
        super(name);
    }

    public void learn(String knowledge) {
        System.out.println("1+1=2我记住了");
    }
}

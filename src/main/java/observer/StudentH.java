/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package observer;

public class StudentH extends Student {
    public StudentH(String name) {
        super(name);
    }

    public void learn(String knowledge) {
        System.out.println("1+1等于三");
    }
}

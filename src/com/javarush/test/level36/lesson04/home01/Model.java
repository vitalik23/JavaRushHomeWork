package com.javarush.test.level36.lesson04.home01;

import java.util.List;

/**
 * Created by Alenka on 07.06.2016.
 */
public class Model {

    private static Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}

package com.mihi8r;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromListDemo {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Mumbai");
        cityList.remove(3);
        System.out.println(cityList);

	}

}

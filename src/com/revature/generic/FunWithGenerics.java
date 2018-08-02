package com.revature.generic;

import java.lang.reflect.Field;

import com.revature.oop.Car;

public class FunWithGenerics {

	public FunWithGenerics() {
		// TODO Auto-generated constructor stub
	}
	
	public static void funWithReflection() {
		try {
			Class clazz = Class.forName("com.revature.oop.Car");
			System.out.println(clazz.getSimpleName());
			
			//Get and print declared fields
			Field[] fields = clazz.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f.getName() + " with a datatype of " + f.getType());
			}
			
			//New instance of Car
			try {
				Car c1 = (Car) clazz.newInstance();
				System.out.println(c1.getClass());
				Field tankPercentage = clazz.getDeclaredField("tankPercentage");
				tankPercentage.setAccessible(true);
				tankPercentage.set(c1, 50);
				System.out.println(c1);
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funWithReflection();
	}

}

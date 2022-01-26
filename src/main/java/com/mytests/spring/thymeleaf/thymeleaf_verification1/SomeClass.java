package com.mytests.spring.thymeleaf.thymeleaf_verification1;

public class SomeClass {
	
	public enum InnerEnum {
		FOO("Foo"),
		BOO("Boo"),
	    BAR("Bar");

		public String getValue() {
			return value;
		}

		private final String value;

		InnerEnum(String b) {
	      this.value = b;
		}
	}
}
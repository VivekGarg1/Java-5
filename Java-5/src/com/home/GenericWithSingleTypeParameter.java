package com.home;

public class GenericWithSingleTypeParameter<T> {

	private T object;

	public GenericWithSingleTypeParameter(T object) {
		super();
		this.object = object;
	}

	public T getObject() {
		return object;
	}

}

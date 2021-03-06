package com.home;

public class GenericWithMultipleTypeParameter<T, U> {

	private T t;
	private U u;

	public GenericWithMultipleTypeParameter(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public U getU() {
		return u;
	}

}

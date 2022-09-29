package com.singleton.designpattern.classic.lazy;

public class SingletonClassicLazy {
	private static SingletonClassicLazy singletonClassicLazy;

	private SingletonClassicLazy() {

	}

	public static SingletonClassicLazy getInstance() {
		if (null == singletonClassicLazy) {
			singletonClassicLazy = new SingletonClassicLazy();
		}
		return singletonClassicLazy;
	}
	// Not a thread safe.
}

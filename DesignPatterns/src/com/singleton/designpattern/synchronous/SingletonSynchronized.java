package com.singleton.designpattern.synchronous;

public class SingletonSynchronized {
	private static SingletonSynchronized singletonSynchronized;

	private SingletonSynchronized() {

	}

	public static synchronized SingletonSynchronized getInstance() {
		if (null == singletonSynchronized) {
			singletonSynchronized = new SingletonSynchronized();
		}
		return singletonSynchronized;
	}
	// Thread safe but decrease performance.
}

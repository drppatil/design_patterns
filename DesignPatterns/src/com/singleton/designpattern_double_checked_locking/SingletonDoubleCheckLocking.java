package com.singleton.designpattern_double_checked_locking;

class SingletonDoubleCheckLocking {
	private static volatile SingletonDoubleCheckLocking singletonDoubleCheckLocking = null;

	private SingletonDoubleCheckLocking() {
	}

	public static SingletonDoubleCheckLocking getInstance() {
		if (null == singletonDoubleCheckLocking) {
			// To make thread safe
			synchronized (SingletonDoubleCheckLocking.class) {
				// check again as multiple threads
				// can reach above step
				if (null == singletonDoubleCheckLocking) {
					singletonDoubleCheckLocking = new SingletonDoubleCheckLocking();
				}
			}
		}
		return singletonDoubleCheckLocking;
	}
}

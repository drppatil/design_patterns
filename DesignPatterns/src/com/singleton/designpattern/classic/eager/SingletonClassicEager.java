package com.singleton.designpattern.classic.eager;

public class SingletonClassicEager {
	private static SingletonClassicEager singletonClassicEager = new SingletonClassicEager();

	private SingletonClassicEager() {

	}

	public static SingletonClassicEager getInstance() {
		return singletonClassicEager;
	}
	//Thread safe. Use this if singleton class is light so it will load quickly.
}

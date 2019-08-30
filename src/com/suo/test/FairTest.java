package com.suo.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平与非公平锁 : synchronized和ReentrantLock
 * 
 *
 */
public class FairTest {
	public static void main(String[] args) {
		//ReentrantLock 默认就是一个非公平锁,可以通过传入参数进行控制
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock(true); //公平锁
		Lock lock3 = new ReentrantLock(false);//非公平锁
		lock3.lock();
		lock3.unlock();
		Condition newCondition = lock3.newCondition();
	}
	
	public synchronized void getNumber(){
		//synchronized 是一个非公平锁
	}
}

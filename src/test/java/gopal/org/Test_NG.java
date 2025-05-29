package gopal.org;

import org.testng.annotations.Test;

public class Test_NG {
	@Test
	public void Test1() {
	System.out.println("Executed in the thread  "+Thread.currentThread().getId());
		}
	@Test
	public void Test2() {
		System.out.println("Executed in the thread  "+Thread.currentThread().getId());
			}
	@Test
	public void Test3() {
		System.out.println("Executed in the thread  "+Thread.currentThread().getId());
			}
	@Test
	public void Test4() {
		System.out.println("Executed in the thread  "+Thread.currentThread().getId());
			}
	}


package test;

import static org.junit.Assert.*;

import org.hyperic.sigar.Sigar;
import org.junit.Test;

public class JunitTest 
{
	@Test
	public void test() {
		Sigar sigar = new Sigar();
		System.out.println(sigar);
	}
}

package duanjunyu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import duanjunyu.mspp.DJKUtil;

public class ZkTest {
	@Test
	public void Demo1(){
		try {
			DJKUtil.isTrue(false, "必须为真");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo2(){
		try {
			DJKUtil.isFalse(true, "必须为假");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo3(){
		try {
			DJKUtil.isNotNull("ss", "必须有值");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo4(){
		try {
			DJKUtil.isNull(null, "必须mei值");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo5(){
		try {
			List<Integer> list=new ArrayList<>();
			DJKUtil.IsNotNullController(list, "集合必须有值");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo6(){
		try {
			Map<String, Integer> map=new HashMap<>();
			map.put("s", 22);
			DJKUtil.IsNotNullMap(map, "集合必须有值");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	@Test
	public void Demo7(){
		try {
			DJKUtil.IsString(null, "必须有值");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void Demo8(){
		try {
			DJKUtil.Iszheng(-77, "必须整数");
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

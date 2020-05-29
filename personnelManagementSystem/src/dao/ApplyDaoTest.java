package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import po.Apply;

public class ApplyDaoTest {
	private ApplyDao applydao=new ApplyDao();

	@Test
	public void testAdd() {
		Apply apply=new Apply();
		apply.setDate("2019-01-01");
		apply.setPlayerid(220856799);
		apply.setContent("我想加入公会1");
		int result = applydao.add(apply);
		System.out.println("add result ："+result);
		
	}

	@Test
	public void testDelete() {
		int result=applydao.delete(3);
		System.out.println("删除结果："+result);
	}

	@Test
	public void testFindApplyByPlayer() {
		Apply apply=applydao.findApplyByPlayer(12);
		System.out.println("by player"+apply.toString());
	}

}

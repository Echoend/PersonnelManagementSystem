package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import po.Group;

public class GroupDao_Test {

private GroupDao groupdao=new GroupDao();
	
	
	@Test
	public void testAdd() {

		Group group = new Group();
		group.setName("tuan1");
		group.setMaster(202005282);
		group.setLabourid(666);
		group.setDescription("一起钢琴块！");
		int result =groupdao.add(group);

		if (result == 1) {
			System.out.println("Success");

		} else {
			System.out.println("Failed");

		}
	}
	
	@Test

	public void testDelete() {

		int result = groupdao.delete(3);
		System.out.println("删除操作： "+ result);

	}

	@Test

	public void testUpdate() {
		Group group=new Group();
		group.setDescription("当代最快乐女网友");
		group.setLabourid(134);
		group.setName("你已经胖很多了");
		group.setLabourid(589);
		int result=groupdao.update(2,group);
		System.out.println("更新："+result);
		
	}

	@Test
	public void testGetCountOfGroup() {
		int id = 234;
		int count = groupdao.getCountOfGroup(id);
		System.out.println("数量 "+ count);
	}


	@Test

	public void testFindGroupById() {
            Group group= groupdao.findGroupById(2);
            System.out.println("by id"+group.toString());
	}


	@Test

	public void testFindGroupByName() {
        Group group= groupdao.findGroupByName("lll");
        System.out.println("by id"+group.toString());
		
	}
	
	
	@Test
	public void testFindAllGroup() {
		ArrayList<Group> group = groupdao.findAllGroup();
		for(Group group1: group){
			System.out.println(group1.toString());
		}
	}

	@Test

	public void testFindGroupByMaster() {
        Group group= groupdao.findGroupByMaster(222);
        System.out.println("by id"+group.toString());
         
	}

}

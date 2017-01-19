package cn.samoye.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;

import cn.samoye.bean.Dept;
import cn.samoye.bean.Emp;
import cn.samoye.bean.Role;
import cn.samoye.bean.RolePrivilege;
import cn.samoye.bean.RolePrivilegeId;

public class TestDemp {
	@Test
	public void testName() throws Exception {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();

		Emp emp = new Emp();
		emp.setEmpName("emp1");
		Emp emp2 = new Emp();
		emp2.setEmpName("emp2");
		
//		session.save(emp);
//		session.save(emp2);
		Dept dept = new Dept();
		dept.setDeptName("dept1");
		dept.getEmps().add(emp);
		dept.getEmps().add(emp2);
		session.save(dept);
		
		ts.commit();
		session.close();
		sf.close();
	}
	
	@Test
	public void testName2() throws Exception {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		Role role = new Role();
		role.setName("admin");
		RolePrivilege rolePrivilege = new RolePrivilege(new RolePrivilegeId(role,"nsfw"));
		RolePrivilege rolePrivilege1 = new RolePrivilege(new RolePrivilegeId(role,"wdkj"));
		HashSet<RolePrivilege> rp = new HashSet<RolePrivilege>();
		rp.add(rolePrivilege);
		rp.add(rolePrivilege1);
		role.setRolePrivileges(rp);
		
		session.save(role);
		
		ts.commit();
		session.close();
		sf.close();
	}
}

package com.home;

public class EnumTest {

	public static void main(String[] args) {
		
		RoleType admin = RoleType.ADMIN;
		System.out.println(admin);
		System.out.println("--------------");
		RoleType[] values = RoleType.values();
		for (RoleType roleType : values) {
			System.out.println(roleType+"\t"+roleType.ordinal());
		}
		System.out.println("--------------");
		
		EmployeeRoleType[] values2 = EmployeeRoleType.values();
		for (EmployeeRoleType employeeRoleType : values2) {
			System.out.println(employeeRoleType+"\t"+employeeRoleType.getRoleCode());
		}
		
		System.out.println("---------------");
		EmployeeRoleType roleType = EmployeeRoleType.HR;
		switch (roleType) {
		case AUDITOR:
			System.out.println("Auditor Task..");
			break;
			
		case ADMIN:
			System.out.println("Admin Task..");
			break;
			
		case HR:
			System.out.println("HR Task..");
			break;
			
		case MANAGER:
			System.out.println("Mnager Task..");
			break;

		default:
			System.out.println("Invalid role type..");
			break;
		}
	}

}

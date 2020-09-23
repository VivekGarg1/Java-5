package com.home;

public enum EmployeeRoleType {

	ADMIN(10), MANAGER(20), HR(30), AUDITOR(40);

	private final int roleCode;

	private EmployeeRoleType(int roleCode) {
		this.roleCode = roleCode;
	}

	public int getRoleCode() {
		return roleCode;
	}

}

package com.example.demo.model;

public class Dept {
    private Long deptId;
    private String deptName;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Long id; 
    public Dept() {}

    

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

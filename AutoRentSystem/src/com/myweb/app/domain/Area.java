package com.myweb.app.domain;

public class Area {
private String id;
private String name;
private String t_no;
private int t_leval;
private int child;
private int isleaf;
private String post;
private int sort;
private String region;
public Area() {
	super();
	// TODO Auto-generated constructor stub
}

public Area(String id, String name, String t_no, int t_leval, int child, int isleaf, String post, int sort,
		String region) {
	super();
	this.id = id;
	this.name = name;
	this.t_no = t_no;
	this.t_leval = t_leval;
	this.child = child;
	this.isleaf = isleaf;
	this.post = post;
	this.sort = sort;
	this.region = region;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getT_no() {
	return t_no;
}
public void setT_no(String t_no) {
	this.t_no = t_no;
}
public int getT_leval() {
	return t_leval;
}
public void setT_leval(int t_leval) {
	this.t_leval = t_leval;
}
public int getChild() {
	return child;
}
public void setChild(int child) {
	this.child = child;
}
public int getIsleaf() {
	return isleaf;
}
public void setIsleaf(int isleaf) {
	this.isleaf = isleaf;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public int getSort() {
	return sort;
}
public void setSort(int sort) {
	this.sort = sort;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}

@Override
public String toString() {
	return "Area [id=" + id + ", name=" + name + ", t_no=" + t_no + ", t_leval=" + t_leval + ", child=" + child
			+ ", isleaf=" + isleaf + ", post=" + post + ", sort=" + sort + ", region=" + region + ", getName()="
			+ getName() + ", getId()=" + getId() + ", getT_no()=" + getT_no() + ", getT_leval()=" + getT_leval()
			+ ", getChild()=" + getChild() + ", getIsleaf()=" + getIsleaf() + ", getPost()=" + getPost()
			+ ", getSort()=" + getSort() + ", getRegion()=" + getRegion() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}

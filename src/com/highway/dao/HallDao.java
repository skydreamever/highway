package com.highway.dao;

import java.util.List;

import com.highway.entity.Hall;

public interface HallDao {
	//查询
	public List searchAllHall();
	//修改
	public String changeHall(Hall hall);
	//增加营业厅
	public String addHall(Hall hall);
	
	//删除营业厅
	public String delHall(Hall hall);

}

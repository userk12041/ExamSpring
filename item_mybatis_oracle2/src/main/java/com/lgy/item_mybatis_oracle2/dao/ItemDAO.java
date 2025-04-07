package com.lgy.item_mybatis_oracle2.dao;

import java.util.ArrayList;

import com.lgy.item_mybatis_oracle2.dto.ItemDTO;


public interface ItemDAO {
	public void write(String name, String price, String description);
	public ArrayList<ItemDTO> list();
}

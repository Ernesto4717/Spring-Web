package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.Item;

public interface ItemService {

	public List<Item> itemList();
	public Item findItemById(int id);
	public boolean createItem(Item item);
}

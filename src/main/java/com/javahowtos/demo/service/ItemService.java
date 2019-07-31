package com.javahowtos.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javahowtos.demo.model.Item;
import com.javahowtos.demo.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public Item createItem(Item item) {
	return itemRepository.save(item);
}
}

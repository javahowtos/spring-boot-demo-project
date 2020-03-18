package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;

import javassist.NotFoundException;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	public Item createItem(Item item) {
		return itemRepository.save(item);
	}

	public Item findItemById(Long id) throws NotFoundException {
		return itemRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Item with id " + id + " not found."));
	}

}

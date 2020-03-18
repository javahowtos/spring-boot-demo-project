package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

import javassist.NotFoundException;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("/api/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@PostMapping("/api/items")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}

	@GetMapping("/api/items/{id}")
	public Item getItemById(@PathVariable(name = "id") Long id) throws NotFoundException {
		return itemService.findItemById(id);
	}
}

package com.javahowtos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javahowtos.demo.model.Item;
import com.javahowtos.demo.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@PostMapping(path = "/api/items")
public Item createItem(@Validated @RequestBody Item item) {
	return itemService.createItem(item);
}
}

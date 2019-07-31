package com.javahowtos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javahowtos.demo.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {

}

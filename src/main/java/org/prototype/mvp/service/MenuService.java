package org.prototype.mvp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.prototype.mvp.domain.Menu;
import org.prototype.mvp.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> searchByCategory(String category){
	
		List<Menu> menus = menuRepository.findByCategory();
		List<Menu> filteredMenus = menus.stream()
				.filter(i -> i.getCategory().getDescription().contains(category))
				.collect(Collectors.toList());
		return filteredMenus.size() > 0 ? filteredMenus : menus;
	}
	
}

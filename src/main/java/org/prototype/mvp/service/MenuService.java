package org.prototype.mvp.service;

import java.util.Collections;
import java.util.List;
import org.prototype.mvp.domain.Menu;
import org.prototype.mvp.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> searchByCategory(String category){
	

		List<Menu> menus = menuRepository.findByCategory(category);
		return menus;
	}
	
}

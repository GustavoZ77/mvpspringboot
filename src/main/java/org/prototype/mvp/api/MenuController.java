package org.prototype.mvp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.prototype.mvp.domain.Menu;
import org.prototype.mvp.service.MenuService;

@RestController
@RequestMapping("api-menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping(value = "/{category}", produces = "application/json")
	public List<Menu> getMenusBYCategory(@PathVariable String category) {
		if (category.isEmpty()) {
			category = "*";
		}
		return menuService.searchByCategory(category);
	}

}

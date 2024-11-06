package webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.models.Category;
import webapp.models.CategoryRepository;

@Controller
public class CategoryController {
@Autowired
CategoryRepository repository;

@GetMapping("/category")
public String index(Model model){
model.addAttribute("list", repository.findAll());
return "category/index";
}
@GetMapping("/category/delete/{id}")
public String delete(@PathVariable("id") short id){
repository.deleteById(id);
return "redirect:/category";
}
@GetMapping("/category/add")
public String add(){
return "category/add";
}
@PostMapping("/category/add")
public String add(Category obj){
repository.save(obj);
return "redirect:/category";
}
@GetMapping("/category/edit/{id}")
public String edit(@PathVariable("id") short id, Model model){
model.addAttribute("o", repository.findById(id).get());
return "category/edit";
}
@PostMapping("/category/edit/{id}")
public String edit(@PathVariable("id") short id, Category obj){
repository.save(obj);
return "redirect:/category";
}
}
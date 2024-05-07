package com.codewithdurgesh.blog.services;
import com.codewithdurgesh.blog.payloads.CategoryDto;
import java.util.List;

public interface CategoryService {

//    create
    CategoryDto createCategory(CategoryDto categoryDto);

//    update
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

//    delete
    public void deleteCategory(Integer categoryId);

//    get
    public CategoryDto getCategory(Integer categoryId);

//    getAll
    List<CategoryDto> getCategories();

}

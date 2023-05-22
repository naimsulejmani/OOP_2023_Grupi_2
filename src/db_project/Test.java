package db_project;

import db_project.infrastructures.ReadableRepository;
import db_project.models.Category;
import db_project.repositories.CategoryRepository;


public class Test {
    public static void main(String[] args) {
        ReadableRepository<Category, Integer> repository = new CategoryRepository();
        var category = repository.findById(1);

        System.out.println(category);
    }
}

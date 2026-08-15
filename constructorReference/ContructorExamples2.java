package constructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Products {
    int id;
    String name;

    public Products(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Products{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

}

public class ContructorExamples2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raju", "Sohail", "Sunil", "Kisor", "Mohan");

        //optional class examples 
        String findName=names.stream().filter(str->str.contains("h")).findFirst().orElse("Not found");
        // without stream api

        System.out.println("Without Stream api");
        List<Products> products=new ArrayList<>();
        for(String name:names){
            products.add(new Products(name));
        }

        for(Products pr:products){
            System.out.println(pr);

        }



        // using stream api
        //List<Products> product = new ArrayList<>();
        System.out.println("With stream api");
        List<Products> product = names.stream()
                .map(name -> new Products(name))
                .toList();

        for(Products pr:product){
            System.out.println(pr);

        }


        System.out.println("Stream api and constructor reference");
        List<Products> productList=names.stream().map(Products::new).toList();
        System.out.println("Method reference");
        productList.forEach(System.out::println);

    }

}

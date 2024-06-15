package org.lessons.java.shop;

public class productTest {

    //bonus exercise
    public static String padder(int i){
        return String.format("%08d", i);
    }

    //create a new product and call its methods
    public static void main(String[] args) {
        product product = new product("bottle", "bottle of water", 10f, 20);
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getVat());
        System.out.println(product.completeName());
        System.out.println(product.grossPrice());
        product.setVat(22);
        product.setDescription("bottle of beer");
        product.setName("beer");
        product.setPrice(15f);
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getVat());
        System.out.println(product.completeName());
        System.out.println(product.grossPrice());

        //test bonus exercise
        System.out.println(productTest.padder(100));
    }
}

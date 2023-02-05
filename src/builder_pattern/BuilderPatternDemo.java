package builder_pattern;

import builder_pattern.builder.ShopBuilder;
import builder_pattern.director.Director;
import builder_pattern.shop.Shop;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Director director = new Director();

        // Toy shop
        ShopBuilder toyShopBuilder = new ShopBuilder();
        director.constructToyShop(toyShopBuilder);
        Shop toyShop = toyShopBuilder.getShop();
        System.out.println(toyShop);

        // Bookshop
        ShopBuilder bookShopBuilder = new ShopBuilder();
        director.constructBookShop(bookShopBuilder);
        Shop bookShop = bookShopBuilder.getShop();
        System.out.println(bookShop);


        // Clothes shop
        ShopBuilder clothesShopBuilder = new ShopBuilder();
        director.constructClothesShop(clothesShopBuilder);
        Shop clothesShop = clothesShopBuilder.getShop();
        System.out.println(clothesShop);
    }
}


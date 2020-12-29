package OpenClosed;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.BIG);
        Product house = new Product("House", Color.BLUE, Size.BIG);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green Products: ");
        productFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(
                        " - " + p.getName() + " is green"
                ));

        System.out.println("Big Products: ");
        productFilter.filter(products, new SizeSpecification(Size.BIG))
                .forEach(p -> System.out.println(
                        " - " + p.getName() + " is big"
                ));

        System.out.println("Blue and Big Products: ");
        productFilter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.BIG)))
                .forEach(p -> System.out.println(
                        " - " + p.getName() + " is blue and big"
                ));
    }
}

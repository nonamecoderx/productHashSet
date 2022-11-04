package product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductList {
    private final HashMap<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer quantity) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            throw new ProductAlreadyExistsException();
        }
        if (quantity <= 0) {
            quantity = 1;
        }
        this.products.put(product, quantity);
    }

    public void checkProduct(String name) {
        for (Product product : products.keySet()) {
            if ((product.getName().contains(name))) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(Product product) {
        Iterator<Map.Entry<Product, Integer>> productIterator = products.entrySet().iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getKey().getName().equals(product.getName())) {
                productIterator.remove();
                break;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов").append('\n');
        for (Product product : products.keySet()) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }

}
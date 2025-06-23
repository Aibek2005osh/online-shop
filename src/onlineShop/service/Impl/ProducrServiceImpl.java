package onlineShop.service.Impl;

import onlineShop.dao.ProductDao;

public class ProducrServiceImpl {
    private final ProductDao productDao ;

    public ProducrServiceImpl(ProductDao productDao) {
        this.productDao = productDao;

    }
}

package onlineShop.models;

import onlineShop.enoms.Color;
import onlineShop.enoms.Size;


import java.math.BigDecimal;
import java.util.Arrays;

public class Product {
    private Long id;
    private String name;
    private BigDecimal prace;
    private Size[] size;
    private Color color;
    private String imegUrl;

    private Long generteId = 0L;

    public Product() {
        this.id = ++generteId;

    }

    public Product(String name, BigDecimal prace, Size[] size, Color color, String imegUrl) {
        this.id = ++generteId;
        this.name = name;
        this.prace = prace;
        this.size = size;
        this.color = color;
        this.imegUrl = imegUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrace() {
        return prace;
    }

    public void setPrace(BigDecimal prace) {
        this.prace = prace;
    }

    public Size[] getSize() {
        return size;
    }

    public void setSize(Size[] size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getImegUrl() {
        return imegUrl;
    }

    public void setImegUrl(String imegUrl) {
        this.imegUrl = imegUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
               "imegUrl='" + imegUrl + '\'' +
               ", color=" + color +
               ", size=" + Arrays.toString(size) +
               ", prace=" + prace +
               ", name='" + name + '\'' +
               ", id=" + id +
               '}';
    }
}
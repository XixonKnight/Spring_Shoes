package applicatiton.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "dbo_product")
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "product_id")
    private int id;

    @Column(name = "category_id", insertable = false, updatable = false)
    private int categoryId;

    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
    private List<ProductImage> imageList = new ArrayList<>();

    @Column(name = "name")
    private String name;

    @Column(name = "short_desc")
    private String shortDESC;

    @Column(name = "price")
    private Double price;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "main_image")
    private String mainImage;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private int size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return categoryId;
    }

    public void setIdCategory(int idCategory) {
        this.categoryId = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDESC() {
        return shortDESC;
    }

    public void setShortDESC(String shortDESC) {
        this.shortDESC = shortDESC;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ProductImage> getImageList() {
        return imageList;
    }

    public void setImageList(List<ProductImage> imageList) {
        this.imageList = imageList;
    }
}

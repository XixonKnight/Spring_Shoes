package applicatiton.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "dbo_category")
public class Category {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "category_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_desc")
    private String shortDESC;

    @Column(name = "create_date")
    private Date createDate;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private List<Product> listProducts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }
}

package applicatiton.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "dbo_cart")
public class Cart {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "cart_id")
    private int id;

    @Column(name = "guid")
    private String guid;

    @Column(name = "username")
    private String username;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
    private List<CartProduct> cartProductList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<CartProduct> cartProductList) {
        this.cartProductList = cartProductList;
    }
}

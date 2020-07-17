package applicatiton.data.model;

import javax.persistence.*;

@Entity(name = "dbo_user_role")
public class UserRole {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "user_role_id")
    private int id;

    @Column(name = "role_id")
    private int roleId;

    @Column(name = "user_id")
    private int userId;

    public UserRole() {
    }

    public UserRole(int roleId, int userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

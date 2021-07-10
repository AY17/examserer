package com.exam.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {

    @Id
    private long roldIsd;
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="role")
    private Set<UserRole> userRole=new HashSet<>();

    public Role() {
    }

    public Role(long roldIsd, String roleName) {
        this.roldIsd = roldIsd;
        this.roleName = roleName;
    }

    public long getRoldIsd() {
        return roldIsd;
    }

    public void setRoldIsd(long roldIsd) {
        this.roldIsd = roldIsd;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

package org.rp.wtd.model.db;

import org.hibernate.annotations.NaturalId;
import org.rp.wtd.model.AbstractModel;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 07.08.19
 * Time: 21:03
 */

@Entity
@Table(name = "user")
public class User extends AbstractModel<Long> {
    private static final long serialVersionUID = 8119713539754865537L;

    @Column(name = "oauth_token")
    private String oauthToken;

    @NaturalId
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "is_email_verified")
    private Boolean emailVerified;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tag> tags;


}

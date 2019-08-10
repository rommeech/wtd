package org.rp.wtd.model.db;

import org.rp.wtd.model.AbstractModel;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 07.08.19
 * Time: 21:01
 */

@Entity
@Table(name = "tag")
public class Tag extends AbstractModel<Long> {
    private static final long serialVersionUID = 8946105132438388649L;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private List<Item> items;
}

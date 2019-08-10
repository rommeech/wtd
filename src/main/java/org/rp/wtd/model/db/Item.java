package org.rp.wtd.model.db;

import org.rp.wtd.model.AbstractModel;
import org.rp.wtd.value.ItemStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 07.08.19
 * Time: 20:18
 */

@Entity
@Table(name = "item")
public class Item extends AbstractModel<Long> {
    private static final long serialVersionUID = 7231891627225234871L;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "name")
    private String name;

    @Column(name = "desctiption")
    private String desctiption;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private ItemStatus status;

    @Column(name = "deadline")
    private LocalDateTime deadline;

    private List<Tag> tags;

}

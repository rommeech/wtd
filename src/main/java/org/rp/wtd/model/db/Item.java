package org.rp.wtd.model.db;

import org.rp.wtd.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.Table;

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
}

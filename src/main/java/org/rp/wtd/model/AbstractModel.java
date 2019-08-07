package org.rp.wtd.model;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 07.08.19
 * Time: 20:17
 */
public class AbstractModel<T> implements Serializable {
    private static final long serialVersionUID = 8514768147225429125L;

    @Id
    private T id;
}

package org.rp.wtd.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 07.08.19
 * Time: 20:17
 */
public class AbstractModel<T> implements Serializable {
    private static final long serialVersionUID = 8514768147225429125L;

    @Id
    @Column(name = "id")
    private T id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
}

package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by Micah Young
 */
@Entity
public class Family {
    @Id
    String id = UUID.randomUUID().toString();

    public Family() {
        this.id = UUID.randomUUID().toString();
    }
}

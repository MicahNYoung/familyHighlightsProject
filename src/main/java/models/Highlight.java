package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Created by Micah Young
 */
@Entity
public class Highlight {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "The description of the highlight cannot be blank")
    private String description;

    @NotBlank(message = "The imageURL cannot be blank")
    private String imageURL;
}

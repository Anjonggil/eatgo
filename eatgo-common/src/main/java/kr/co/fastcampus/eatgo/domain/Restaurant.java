package kr.co.fastcampus.eatgo.domain;




import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;
    @NotEmpty
    private String address;
    @NotNull
    private Long categoryId;



    @Transient
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<MenuItem> menuItems;
    @Transient
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Review> reviews;


    public Restaurant(Long id,String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Restaurant(String name, String address) {
        this.name  = name;
        this.address = address;
    }


    public String getInformation() {

        return  name + " in " + address;
    }


    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);

    }


    public void updateInformation(String name, String address) {
        this.name= name;
        this.address = address;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = new ArrayList<>(reviews);
    }
}


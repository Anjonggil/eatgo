package kr.co.fastcampus.eatgo.domain;

public class RestaurantNotFoundException extends RuntimeException {


    public RestaurantNotFoundException(long id) {
        super("Cold not find restaurant"+id);
    }
}

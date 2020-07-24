package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class RestaurantTests {

    @Test
    public void creation(){
//        Restaurant restaurant = new Restaurant(1004L,"Bob zip","");
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob zip")
                .address("Seoul")
                .build();
        assertThat(restaurant.getId(),is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getName(), is("Bob zip"));
    }
    @Test
    public void information(){
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob zip")
                .address("Seoul")
                .build();

        assertThat(restaurant.getInformation(),is("Bob zip in Seoul"));
    }
}
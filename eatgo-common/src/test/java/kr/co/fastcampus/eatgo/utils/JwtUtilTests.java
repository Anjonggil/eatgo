package kr.co.fastcampus.eatgo.utils;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTests {

    @Test
    public void createToken(){
        String secret = "12345678901234567890123456789012";
        JwtUtil jwtUtil = new JwtUtil(secret);

        String token = jwtUtil.createToken(1004l,"john");

        assertThat(token, containsString("."));
    }

}
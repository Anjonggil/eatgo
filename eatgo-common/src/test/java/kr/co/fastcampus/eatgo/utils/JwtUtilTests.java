package kr.co.fastcampus.eatgo.utils;

import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.Is.is;
class JwtUtilTests {

    private static String SECRET = "12345678901234567890123456789012";

    private JwtUtil jwtUtil;

    @BeforeEach
    public void setUp(){
        jwtUtil = new JwtUtil(SECRET);
    }
    @Test
    public void createToken(){



        String token = jwtUtil.createToken(1004l,"john");

        assertThat(token, containsString("."));
    }
    @Test
    public void getClaims(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOjEwMDQsIm5hbWUiOiJqb2huIn0.RvCrbP473aakKmeFxmIDfeV_2uPT54rdoqcYhsqAhII";

        Claims claims = jwtUtil.getClaims(token);

        assertThat(claims.get("userId",Long.class), is(1004L));
        assertThat(claims.get("name"), is("john"));

    }


}
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

public class TestJwt {
    String password = "123456";

    @Test
    public void Jwt(){
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(password);
        // return password;
    }
}

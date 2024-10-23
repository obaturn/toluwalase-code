import Regex.RegexEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexEmailTest {

    @Test
    void validateEmail() {
        Assertions.assertTrue(RegexEmail.validateEmail("testlar@email.com"));
        assertTrue(RegexEmail.validateEmail("user.name@dominant.co"));
        assertTrue(RegexEmail.validateEmail("user-name123@dom.org"));

    }

    @Test
    void validatePhoneNumber() {
        assertTrue(RegexEmail.validatePhoneNumber("+2347012345678"));
        assertTrue(RegexEmail.validatePhoneNumber("07012345678"));
        assertTrue(RegexEmail.validatePhoneNumber("+2348112345678"));


    }
}
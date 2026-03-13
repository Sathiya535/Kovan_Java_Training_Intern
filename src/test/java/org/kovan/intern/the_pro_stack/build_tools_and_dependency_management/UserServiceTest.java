package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

import org.junit.jupiter.api.Test;
import org.kovan.intern.console_store.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testLogin() {

        UserService userService = new UserService();

        boolean result = userService.login("lala", "1234");

        assertTrue(result);
    }

}
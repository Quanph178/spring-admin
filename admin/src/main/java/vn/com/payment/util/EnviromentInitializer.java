package vn.com.payment.util;

import vn.com.payment.spi.ErrorCodeFactory;

import java.lang.invoke.MethodHandles;

public class EnviromentInitializer {
    public static void initialize() {
        try {
            System.setProperty("payment.response.prefix-code", "PMA-");
            var lookup = MethodHandles.lookup();
            lookup.ensureInitialized(ErrorCodeFactory.class);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Can't init java class", e);
        }
    }
}

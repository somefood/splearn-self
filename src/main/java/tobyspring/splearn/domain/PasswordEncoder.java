package tobyspring.splearn.domain;

public interface PasswordEncoder {
    String encode(String password);
    boolean matches(String passwords, String passwordHash);
}

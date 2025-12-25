package guru.springframework;

import org.junit.jupiter.api.*;

import javax.crypto.KeyAgreement;


class GreatingTest {
    private Greating greating;

    @BeforeEach
    void setUp() {
        System.out.println("In before");
        greating = new Greating();
    }

    @BeforeAll
    static void setUpAll() {
        System.out.println("Before all");
    }

    @Test
    void helloWorld() {
        System.out.println(greating.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greating.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all");
    }
}
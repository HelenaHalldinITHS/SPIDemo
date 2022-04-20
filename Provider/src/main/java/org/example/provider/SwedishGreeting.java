package org.example.provider;

import org.example.greet.Greeting;

public class SwedishGreeting implements Greeting {
    @Override
    public String greet() {
        return "hejhej";
    }
}

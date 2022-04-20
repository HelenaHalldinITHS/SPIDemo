package org.example.provider;

import org.example.greet.Greeting;

public class EnglishGreeting implements Greeting {
    @Override
    public String greet() {
        return "Howdy!";
    }
}

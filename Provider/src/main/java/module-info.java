import org.example.greet.Greeting;
import org.example.provider.EnglishGreeting;
import org.example.provider.SwedishGreeting;

module org.example.greetingsprovider {
    requires org.example.greeting;
    provides Greeting with SwedishGreeting, EnglishGreeting;
}
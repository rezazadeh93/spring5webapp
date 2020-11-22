package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final PublisherRepository publisherRepository;

    public BootstrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher aminEshghi = new Publisher(
                "Amin Eshghi", "no.79, Eskandari st.",
                "Tehran", "Tehran", "1436659991"
        );


        publisherRepository.save(aminEshghi);

        System.out.println("bootstrap is running ....");
        System.out.println("publisher's count is " + publisherRepository.count());
        System.out.println("publisher = " + aminEshghi);
    }
}

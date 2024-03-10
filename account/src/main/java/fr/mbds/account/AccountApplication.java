package fr.mbds.account;

import fr.mbds.account.entities.Account;
import fr.mbds.account.enums.CurrencyType;
import fr.mbds.account.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
        return args -> {
            // accountRepository.save(new Account("1", "John Doe", 1000, CurrencyType.EUR));
            // accountRepository.save(new Account("2", "Jane Doe", 2000, CurrencyType.USD));
            Account account = Account
                    .builder()
                    .balance(1000*Math.random())
                    .dateCreated(LocalDate.now())
                    .customerId(1L)
                    .currency(CurrencyType.EUR)
                    .build();
            accountRepository.save(account);
        };
    }
}

package fr.mbds.account.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

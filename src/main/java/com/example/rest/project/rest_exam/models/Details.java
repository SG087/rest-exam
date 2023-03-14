package com.example.rest.project.rest_exam.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Entity
@Transactional
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "details")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotBlank(message = "The email field should not be empty")
    @Email(message = "Enter the correct email")
    @Size(min = 6, max = 64, message = "The email length should be in the range from 6 to 64 characters")
    private String email;
    @NotBlank(message = "The phone number should not be empty")
    @Size(min = 8, max = 30, message = "The phone number length should be in the range from 8 to 30 characters")
    @Pattern(regexp = "^\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}$",
            message = "Phone number must be in the format +7(***) ***-**-**")
    private String proneNumber;

    @NotBlank(message = "Address should not be empty")
    @Size(min = 5, max = 100, message = "Address should be between 5 and 100 characters")
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return id == details.id
                && Objects.equals(email, details.email)
                && Objects.equals(proneNumber, details.proneNumber)
                && Objects.equals(address, details.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, proneNumber, address);
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", proneNumber='" + proneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

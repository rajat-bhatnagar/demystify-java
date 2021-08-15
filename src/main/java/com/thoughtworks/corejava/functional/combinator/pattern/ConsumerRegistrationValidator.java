package com.thoughtworks.corejava.functional.combinator.pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface ConsumerRegistrationValidator extends Function<Customer, ConsumerRegistrationValidator.ValidationResult> {

    static ConsumerRegistrationValidator isValidEmail() {
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.IS_INVALID_EMAIL;
    }

    static ConsumerRegistrationValidator isValidPhoneNumber() {
        return customer -> (customer.getPhoneNumber().startsWith("70") && customer.getPhoneNumber().length() == 10)
                ? ValidationResult.SUCCESS : ValidationResult.IS_INVALID_PHONE_NUMBER;
    }

    static ConsumerRegistrationValidator isValidDob() {
        return customer -> (Period.between(customer.getDob(), LocalDate.now()).getYears() > 18) ? ValidationResult.SUCCESS :
                ValidationResult.IS_INVALID_AGE;
    }

    default ConsumerRegistrationValidator and(ConsumerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        IS_INVALID_EMAIL,
        IS_INVALID_AGE,
        IS_INVALID_PHONE_NUMBER
    }
}

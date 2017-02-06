package com.validation.annotations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.group.DefaultGroupSequenceProvider;

import com.validation.ValidationGroups;

public class MyCustomSequenceProvider
implements DefaultGroupSequenceProvider<Employee> {

public List<Class<?>> getValidationGroups(Employee employee) {

    List<Class<?>> sequence = new ArrayList<Class<?>>();

    // Apply all validation rules from ConditionalValidation group
    // only if someField has given value
    if ("CA".equals(employee.getType())) {
        sequence.add(ValidationGroups.ValidateCA.class);
    }
    if ("CHK".equals(employee.getType())) {
        sequence.add(ValidationGroups.ValidateCHK.class);
    }
    if ("ACH".equals(employee.getType())) {
        sequence.add(ValidationGroups.ValidateACH.class);
    }

    // Apply all validation rules from default group
    sequence.add(Employee.class);

    return sequence;
}
}
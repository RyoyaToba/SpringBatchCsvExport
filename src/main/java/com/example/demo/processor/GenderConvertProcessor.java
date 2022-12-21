package com.example.demo.processor;

import com.example.demo.domain.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("GenderConvertProcessor")
@StepScope
@Slf4j
public class GenderConvertProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(Employee item) throws Exception {

        try {
            item.convertGenderIntToString();
        } catch (Exception e) {
            log.warn(e.getLocalizedMessage(), e);
            return null;
        }
        return item;
    }
}

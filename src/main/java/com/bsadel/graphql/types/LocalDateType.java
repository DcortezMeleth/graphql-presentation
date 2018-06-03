package com.bsadel.graphql.types;

import graphql.language.StringValue;
import graphql.schema.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class LocalDateType extends GraphQLScalarType {

    public LocalDateType() {
        super("LocalDate", "LocalDate type", new Coercing() {
            @Override
            public Object serialize(Object o) throws CoercingSerializeException {
                return ((LocalDate) o).format(DateTimeFormatter.ISO_DATE);
            }

            @Override
            public Object parseValue(Object o) throws CoercingParseValueException {
                return serialize(o);
            }

            @Override
            public Object parseLiteral(Object o) throws CoercingParseLiteralException {
                if (o instanceof StringValue) {
                    return LocalDate.parse(((StringValue) o).getValue());
                }
                return null;
            }
        });
    }
}

package com.cds.miniproject.util;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class CsvParser {
    public static <T> List<T> parseCsv(String filename, Class<T> type) {
        try {
            File csvFile = new ClassPathResource(filename).getFile();
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            ObjectMapper csvMapper = new CsvMapper();
            MappingIterator<T> it = csvMapper.readerFor(type).with(schema).readValues(csvFile);
            return it.readAll();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    };
}

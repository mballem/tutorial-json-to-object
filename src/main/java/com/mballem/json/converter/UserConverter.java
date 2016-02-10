package com.mballem.json.converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.mballem.json.domain.User;

import java.io.*;
import java.util.List;

/**
 * Created by http://www.mballem.com/ on 09/02/2016.
 */
public class UserConverter implements IConverter<User> {

    public void collectionToJson(String file, List<User> users) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new FileOutputStream(file), users);
    }

    public List<User>jsonToCollection(InputStream file) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(file, new TypeReference<List<User>>() {});
    }
}

package com.mballem.json;

import com.mballem.json.converter.IConverter;
import com.mballem.json.converter.UserConverter;
import com.mballem.json.domain.Phone;
import com.mballem.json.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by http://www.mballem.com/ on 09/02/2016.
 */
public class JsonTutorial {

    private static final Logger logger = Logger.getLogger("JsonTutorial");

    public static void main(String[] args) {

        JsonTutorial jsonTutorial = new JsonTutorial();

        IConverter<User> converter = new UserConverter();
        try {

            //Carrega o arquivo presente no classpath da aplicação
            InputStream is = jsonTutorial.fileLocation("script/users.json");

            List<User> users = converter.jsonToCollection(is);
            users.forEach(System.out::println);

            //Local onde o arquivo será gravado
            String file = "C:\\list.json";
            converter.collectionToJson(file, users);

        } catch (IOException ex) {
            logger.log(Level.SEVERE, "ocorreu um erro", ex);
        }
    }

    private InputStream fileLocation(String file) {

        return getClass().getClassLoader().getResourceAsStream(file);
    }
}

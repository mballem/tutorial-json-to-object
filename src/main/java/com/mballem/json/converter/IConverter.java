package com.mballem.json.converter;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by http://www.mballem.com/ on 09/02/2016.
 */
public interface IConverter<T> {

    void collectionToJson(String file, List<T> entity) throws IOException;

    List<T> jsonToCollection(InputStream is) throws IOException;
}

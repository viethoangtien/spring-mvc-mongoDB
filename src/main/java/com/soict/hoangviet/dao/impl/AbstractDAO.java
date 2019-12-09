package com.soict.hoangviet.dao.impl;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.soict.hoangviet.dao.IGenericDAO;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Component
public class AbstractDAO<T> implements IGenericDAO<T> {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

    public MongoCollection<T> getCollection(Class<T> clazz, String collectionName) {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient(
                resourceBundle.getString("hostname"),
                MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        return mongoClient.getDatabase(resourceBundle.getString("databaseName"))
                .withCodecRegistry(pojoCodecRegistry)
                .getCollection(collectionName, clazz)
                .withCodecRegistry(pojoCodecRegistry);
    }


    @Override
    public List<T> findAll(Class<T> clazz, String collectionName) {
        List<T> lists = new ArrayList<>();
        Block<T> executeBlock = new Block<T>() {
            @Override
            public void apply(final T model) {
                lists.add(model);
            }
        };
        getCollection(clazz, collectionName).find().forEach(executeBlock);
        return lists;
    }

    @Override
    public List<T> save(List<T> lists, Class<T> clazz, String collectionName) {
        getCollection(clazz, collectionName).insertMany(lists);
        return lists;
    }

}

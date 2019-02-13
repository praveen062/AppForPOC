package com.zimave.assignment.zivame.support.serialization;

import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonSerializationUsingGoogleGson<T> {
	  private final Gson gson;

	    public JsonSerializationUsingGoogleGson() {
	        final GsonBuilder builder = new GsonBuilder();
	        builder.setPrettyPrinting();

	        this.gson = builder.create();
	    }

	    public String serialize(final Object result) {
	        return this.gson.toJson(result);
	    }
	    
	    public String serialize(final Collection<T> collection) {
	        return serializedJsonFrom(collection.toArray());
	    }
	    
	    public String serializedJsonFrom(final Object[] dataObjects) {
			return gson.toJson(dataObjects);
		}
}

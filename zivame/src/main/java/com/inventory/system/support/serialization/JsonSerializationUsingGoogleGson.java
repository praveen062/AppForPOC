package com.inventory.system.support.serialization;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@ComponentScan
public class JsonSerializationUsingGoogleGson<T> implements JsonSerializationUsingGoogleGsonService{
	private final Gson gson;

	public JsonSerializationUsingGoogleGson() {
		final GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();

		this.gson = builder.create();
	}

	@Override
	public String serialize(final Object result) {
		return this.gson.toJson(result);
	}

	@Override
	public String serializedJsonFrom(final Object[] dataObjects) {
		return gson.toJson(dataObjects);
	}


	@Override
	public String serialize(Collection<?> collection) {
		return serializedJsonFrom(collection.toArray());
	}
}

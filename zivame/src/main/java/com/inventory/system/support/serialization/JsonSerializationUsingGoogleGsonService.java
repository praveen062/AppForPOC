package com.inventory.system.support.serialization;

import java.util.Collection;

public interface JsonSerializationUsingGoogleGsonService {
	String serialize(final Object result);

	String serialize(final Collection<?> collection);

	String serializedJsonFrom(final Object[] dataObjects);

}

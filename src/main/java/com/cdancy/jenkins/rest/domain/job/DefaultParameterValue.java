package com.cdancy.jenkins.rest.domain.job;

import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

@AutoValue
public abstract class DefaultParameterValue {

    @Nullable
    public abstract String clazz();

    public abstract String value();

    @SerializedNames({"_class", "value"})
    public static DefaultParameterValue create(final String clazz, final String value) {
        return new AutoValue_DefaultParameterValue(clazz, value);
    }

}

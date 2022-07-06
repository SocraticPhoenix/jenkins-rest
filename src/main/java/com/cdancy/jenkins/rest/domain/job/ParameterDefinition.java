package com.cdancy.jenkins.rest.domain.job;

import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

@AutoValue
public abstract class ParameterDefinition {

    @Nullable
    public abstract String clazz();

    @Nullable
    public abstract DefaultParameterValue defaultValue();

    public abstract String description();

    public abstract String name();

    public abstract String type();

    @SerializedNames({"_class", "defaultParameterValue", "description", "name", "type"})
    public static ParameterDefinition create(final String clazz, final DefaultParameterValue defaultValue, String description, String name, String type) {
        return new AutoValue_ParameterDefinition(clazz, defaultValue, description, name, type);
    }

}

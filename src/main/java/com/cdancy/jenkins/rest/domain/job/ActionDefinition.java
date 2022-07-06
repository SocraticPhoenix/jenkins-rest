package com.cdancy.jenkins.rest.domain.job;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import java.util.List;

@AutoValue
public abstract class ActionDefinition {

    @Nullable
    public abstract String clazz();

    public abstract List<ParameterDefinition> parameterDefinitions();

    @SerializedNames({"_class", "parameterDefinitions"})
    public static ActionDefinition create(final String clazz, List<ParameterDefinition> parameterDefinitions) {
        return new AutoValue_ActionDefinition(clazz, parameterDefinitions != null ? ImmutableList.copyOf(parameterDefinitions) : ImmutableList.of());
    }

}

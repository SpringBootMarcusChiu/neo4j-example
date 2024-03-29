package com.neo4j.example.springdataneo4jintroapp.model3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@EqualsAndHashCode(callSuper = true)
@Data
@RelationshipEntity("REL_2")
public class Relationship2 extends Asset {
    @StartNode
    private ApplicationModule applicationModule;
    @EndNode
    private Api api;

    public void setApplicationModule(ApplicationModule applicationModule) {
        this.applicationModule = applicationModule;
        applicationModule.setRelationship2List(this);
    }

    public void setApi(Api api) {
        this.api = api;
        api.setRelationship2(this);
    }
}

package com.sparta.travelshooting.notification.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotify is a Querydsl query type for Notify
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotify extends EntityPathBase<Notify> {

    private static final long serialVersionUID = 309929212L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotify notify = new QNotify("notify");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isRead = createBoolean("isRead");

    public final StringPath message = createString("message");

    public final com.sparta.travelshooting.user.entity.QUser user;

    public QNotify(String variable) {
        this(Notify.class, forVariable(variable), INITS);
    }

    public QNotify(Path<? extends Notify> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotify(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotify(PathMetadata metadata, PathInits inits) {
        this(Notify.class, metadata, inits);
    }

    public QNotify(Class<? extends Notify> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.sparta.travelshooting.user.entity.QUser(forProperty("user")) : null;
    }

}


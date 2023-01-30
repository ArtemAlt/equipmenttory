create table models
(
    id   uuid primary key default gen_random_uuid(),
    name varchar not null unique
);

create table dimension_features
(
    id    uuid primary key default gen_random_uuid(),
    name  varchar not null unique,
    value varchar not null
);


create table dimensions
(
    id      uuid primary key default gen_random_uuid(),
    size varchar(11) not null check ( size in ('SINGLE_UNIT',
                                                         'EMPTY_UNIT',
                                                         'DOUBLE_UNIT'))
);

create table dimensions_feature
(
    id                   uuid primary key default gen_random_uuid(),
    dimension_id         uuid references dimensions (id),
    dimension_feature_id uuid references dimension_features (id)
);

create table manufacturers
(
    id   uuid primary key default gen_random_uuid(),
    name varchar not null unique
);

create table equipments
(
    id              uuid primary key default gen_random_uuid(),
    name            varchar not null,
    model_id        uuid references models (id),
    manufacturer_id uuid references manufacturers (id),
    dimension_id    uuid references dimensions (id)
);

create table features
(
    id uuid primary key default gen_random_uuid(),
    name varchar not null unique,
    value varchar not null
);
create table feature_equipment
(
    id           uuid primary key default gen_random_uuid(),
    equipment_id uuid references equipments (id),
    feature_id uuid references features(id)
);




create table if not exists models
(
    id   uuid primary key default gen_random_uuid(),
    name varchar not null unique
);
INSERT INTO models (id, name)
VALUES ('0a00a0a0-00a0-0000-a000-aa0a0a000a00', 'DEFAULT_MODEL');

create table if not exists dimension_features
(
    id    uuid primary key default gen_random_uuid(),
    name  varchar not null unique,
    value varchar not null
);


create table  if not exists dimensions
(
    id   uuid primary key default gen_random_uuid(),
    size varchar(11) not null check ( size in ('SINGLE_UNIT',
                                               'EMPTY_UNIT',
                                               'DOUBLE_UNIT'))
);
insert into dimensions(id, size)
VALUES ('0a00a0a0-00a0-0000-a000-aa0a0a000a00', 'EMPTY_UNIT');

create table if not exists dimensions_feature
(
    id                   uuid primary key default gen_random_uuid(),
    dimension_id         uuid references dimensions (id),
    dimension_feature_id uuid references dimension_features (id)
);

create table if not exists manufacturers
(
    id   uuid primary key default gen_random_uuid(),
    name varchar not null unique
);
insert into manufacturers (id, name)
values ('0a00a0a0-00a0-0000-a000-aa0a0a000a00', 'DEFAULT_NAME');

create table if not exists equipments
(
    id              uuid primary key default gen_random_uuid(),
    name            varchar unique not null,
    model_id        uuid           not null references models (id),
    manufacturer_id uuid           not null references manufacturers (id),
    dimension_id    uuid           not null references dimensions (id)
);

create table if not exists features
(
    id    uuid primary key default gen_random_uuid(),
    name  varchar not null unique,
    value varchar not null
);
create table if not exists feature_equipment
(
    id           uuid primary key default gen_random_uuid(),
    equipment_id uuid references equipments (id),
    feature_id   uuid references features (id)
);




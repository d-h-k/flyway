use flyhigh;

delete
from flyhigh.flyway_schema_history
where installed_rank=1;

select *
from flyway_schema_history;

CREATE TABLE member
(
    id   BIGINT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);


truncate TABLE "flyway_schema_history";

drop table flyway_schema_history;

drop table hibernate_sequence;
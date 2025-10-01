create table if not exists hello (
                                     id bigserial primary key,
                                     msg text not null
);
insert into hello(msg) values ('Docker Compose OK'), ('Database seeded');

-- CREATE TABLE IF NOT EXISTS hello (
--                                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
--                                      msg VARCHAR(255) NOT NULL
--     );
--
-- INSERT INTO hello (msg) VALUES
--                             ('Docker Compose OK'),
--                             ('Database seeded');

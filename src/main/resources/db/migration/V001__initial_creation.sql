CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    balance NUMERIC(19, 2) NOT NULL,
    role VARCHAR(20),
    CONSTRAINT email_unique UNIQUE (email)
);
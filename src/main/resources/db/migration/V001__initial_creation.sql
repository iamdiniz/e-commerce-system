CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    balance NUMERIC(19, 2) NOT NULL,
    role TEXT NOT NULL
);

ALTER TABLE users ADD CONSTRAINT unique_email UNIQUE (email);
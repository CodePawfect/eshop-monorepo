CREATE TABLE IF NOT EXISTS t_product(
    id SERIAL PRIMARY KEY,
    number VARCHAR(10) NOT NULL UNIQUE,
    name   VARCHAR NOT NULL,
    description VARCHAR NOT NULL,
    category VARCHAR NOT NULL,
    price DECIMAL(10,2) NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_number ON t_product(number);
CREATE INDEX IF NOT EXISTS idx_category ON t_product(category);

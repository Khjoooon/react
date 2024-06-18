-- Active: 1714104693276@@127.0.0.1@3306@product
CREATE TABLE `product` (
	id	CHAR(36) NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INT NOT NULL DEFAULT 0,
    img TEXT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
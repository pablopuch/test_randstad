-- Insertar los datos de ejemplo en la tabla precios
DROP TABLE IF EXISTS PRECIOS;
CREATE TABLE PRECIOS (
id Long AUTO_INCREMENT PRIMARY KEY,
start_date DATE NOT NULL,
end_date DATE NOT NULL,
price_list INT NOT NULL,
product_id INT NOT NULL,
priority BOOLEAN NOT NULL,
price DOUBLE NOT NULL,
curr VARCHAR (3) NOT NULL
);

INSERT INTO precios (start_date, end_date, price_list, product_id, priority, price, curr)
VALUES ('2020-06-14T00:00:00.000+00:00', '2020-12-31T23:59:59.000+00:00', 1, 35455, false, 35.5, 'EUR');

INSERT INTO precios (start_date, end_date, price_list, product_id, priority, price, curr)
VALUES ('2020-06-14T15:00:00.000+00:00', '2020-06-14T18:30:00.000+00:00', 2, 35455, false, 25.45, 'EUR');

INSERT INTO precios (start_date, end_date, price_list, product_id, priority, price, curr)
VALUES ('2020-06-15T00:00:00.000+00:00', '2020-06-15T11:30:00.000+00:00', 3, 35455, false, 30.5, 'EUR');

INSERT INTO precios (start_date, end_date, price_list, product_id, priority, price, curr)
VALUES ('2020-06-15T16:00:00.000+00:00', '2020-12-31T23:59:59.000+00:00', 4, 35455, false, 38.95, 'EUR');

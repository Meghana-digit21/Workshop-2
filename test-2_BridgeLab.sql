create table customers(
	customer_id int primary key,
	name varchar,
	email varchar
);

create table orders(
	order_id int primary key,
	customer_id int,
	order_date date,
	total_amount int,
	foreign key (customer_id) references customers (customer_id)
);

create table products(
	product_id int primary key,
	product_name varchar,
	price int
);

create table order_items(
	order_item_id int primary key,
	order_id int,
	product_id int,
	quantity int,
	foreign key (order_id) references orders (order_id),
	foreign key (product_id) references products (product_id)
);

create table categories(
	category_id int primary key,
	category_name varchar
);


INSERT INTO customers (customer_id, name, email) VALUES
(1, 'Meghana Barla', 'megh.barla@example.com'),
(2, 'Vaibhav', 'vaibhav.harsh@example.com'),
(3, 'Justin Beiber', 'justin.beiber@example.com'),
(4, 'Selena Gomez', 'selena.gomez@example.com'),
(5, 'William Brown', 'william.brown@example.com');
 
INSERT INTO orders (order_id, customer_id, order_date, total_amount) VALUES
(1, 1, '2023-08-01', 689.97),   
(2, 2, '2023-08-02', 45.98),    
(3, 3, '2023-08-03', 1279.96), 
(4, 4, '2023-08-04', 75.98),
(5, 5, '2023-08-05', 239.98);
 
INSERT INTO products (product_id, product_name, price) VALUES
(1, 'Smartphone', 599.99),
(2, 'Laptop', 999.99),
(3, 'Fiction Book', 19.99),
(4, 'T-shirt', 15.99),
(5, 'Headphones', 89.99),
(6, 'Blender', 49.99),
(7, 'Yoga Mat', 29.99),
(8, 'Cookbook', 25.99),
(9, 'Jeans', 39.99),
(10, 'Tent', 199.99);
 
INSERT INTO order_items (order_item_id, order_id, product_id, quantity) VALUES
(1, 1, 1, 1),   
(2, 1, 5, 1),   
(3, 2, 3, 2),   
(4, 3, 2, 1),   
(5, 3, 10, 1),  
(6, 4, 8, 1),   
(7, 4, 6, 1),   
(8, 5, 7, 2),   
(9, 5, 4, 1);  

INSERT INTO categories (category_id, category_name) VALUES
(1, 'Electronics'),
(2, 'Books'),
(3, 'Clothing'),
(4, 'Home & Kitchen'),
(5, 'Sports & Outdoors');



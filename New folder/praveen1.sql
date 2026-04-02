CREATE TABLE customers (
    customer_id INT,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT,
    customer_id INT,
    amount INT
);

INSERT INTO customers VALUES
(1, 'Vignesh', 'Chennai'),
(2, 'arun', 'Bangalore'),
(3, 'Anuj', 'Thirunelveli');

INSERT INTO orders VALUES
(101, 1, 6000),
(102, 2, 4000),
(103, 3, 8000);

SELECT 
    o.order_id,
    c.customer_name,
    c.city,
    o.amount
FROM 
    orders o, customers c
WHERE 
    o.customer_id = c.customer_id
    AND o.amount > 5000;

SELECT e.emp_name, d.dept_name, e.salary
FROM employees e, departments d
WHERE e.dept_id = d.dept_id
AND e.salary > 30000
AND d.dept_name = 'HR';
